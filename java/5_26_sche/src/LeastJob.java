
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화 대기열에서 가져오기");
		
	}

	@Override
	public void sendCallAgent() {
		System.out.println("현재 상담업무가 없거나 상담대기가 적은 상담원에게 할당");
		
	}

}
