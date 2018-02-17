package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("design.fxml"));//현재의 클래스에서 design.fxml파일을 읽어들인다.
		primaryStage.setScene(new Scene(root));			//화면 지정
		primaryStage.setTitle("javaFX 계산기 프로그램");
		primaryStage.show(); 							//화면 열기
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
