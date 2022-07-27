
public class priorityAllocation implements Scheduler  {

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 전화를 먼저");
		
	}

	@Override
	public void sendCallAgent() {
		System.out.println("업무 스킬이 가장 높은 상담원의 대기열 앞에 우선 배분");
		
	}

}
