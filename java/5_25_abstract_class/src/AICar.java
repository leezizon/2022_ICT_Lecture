
public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행시작");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다");
		
	}

}
