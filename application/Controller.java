package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
	
	private String operator = "";	//어떤 연산자를 눌렀는지 저장해 줄 수 있는 변수
	private int x = 0 ;		//기존의 숫자 
	private Model model = new Model();
	
	@FXML
	private Text result;	//Text 변수를 받아올 result 변수
	
	@FXML
	private void operand(ActionEvent event) {
		result.setText(result.getText()+ ((Button)event.getSource()).getText());
		//result 의 텍스트 입력값에다가 기존에 가지고 있던 텍스트에 이벤트 발생으로 얻은 버튼 값으로 부터 얻은 텍스트 값을 추가로 더해준다. 
	}
	
	@FXML
	private void operator(ActionEvent event) {
		if(((Button) event.getSource()).getText().equals("=")) {
			result.setText(model.calculate(operator, x, Integer.parseInt(result.getText()))+"");
			//화면을 기존에 있던 연산자와 기존의 숫자 현재 화면에 있는 숫자로 calculate 한 후 그값을 문자화 시켜줄 수 있도록 공백 문자.
		}else {
			operator = ((Button)event.getSource()).getText();
			x = Integer.parseInt(result.getText());
			result.setText("");
		}
	}
}
