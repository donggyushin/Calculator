package application;

public class Model {
	//효율적인 설계를 위한 클래스
	public int calculate(String operator, int x, int y) {
		if(operator.equals("+")) {
			return x+y;
		}
		else if(operator.equals("-")) {
			return x-y;
		}
		else if(operator.equals("*")) {
			return x*y;
		}
		else return x/y;
	}

	
}
