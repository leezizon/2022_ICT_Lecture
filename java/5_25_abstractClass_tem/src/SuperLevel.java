
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("높게 점프");
	}

	@Override
	public void turn() {
		System.out.println("크게 돌기");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****고급자레벨입니다*****");
		
	}

}
