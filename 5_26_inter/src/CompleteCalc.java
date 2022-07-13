
public class CompleteCalc extends Calculator {
	
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int dicide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
		
	}
	
	public void showInfo() {
		System.out.println("인터페이스 구현");
	}
}
