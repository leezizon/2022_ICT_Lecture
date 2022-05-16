
public class Bus {
	private static Bus bus;
	
	private Bus() {
		
	}
	
	public static Bus getBusInstance() {
		if(bus == null) {
			bus = new Bus(); 
			System.out.println("----------------------");
			System.out.println("버스 최초 생성");
			System.out.println("----------------------");
		}
		return bus;
	}
	
	
	private int money = 0;
	private int studentFee = 720;
	private int workFee = 1250;
	private int passengerCount = 0;
	
	public void takeBus(People people) {
		if (people.job == "직장인"&&people.payFee(workFee)) {
			people.money -= this.workFee; 
			this.money += this.workFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("직장인입니다");
			System.out.println(people.name+"의 잔액 : "+people.money); 
			System.out.println("버스의 수입 : "+this.money); 
			System.out.println("버스에 탄 사람의 수 : "+ passengerCount);
			System.out.println("----------------------");
		}
		else if(people.job == "학생"&&people.payFee(studentFee)) {
			people.money -= this.studentFee;
			this.money += this.studentFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("학생입니다");
			System.out.println(people.name+"의 잔액 : "+people.money); 
			System.out.println("버스의 수입 : "+this.money); 
			System.out.println("버스에 탄 사람의 수 : "+ passengerCount); 
			System.out.println("----------------------");
		}
		else {
		System.out.println("----------------------");
		System.out.println("잔액이 부족합니다");
		System.out.println(people.name+"의 잔액 : "+people.money); 
		System.out.println("버스의 수입 : "+this.money); 
		System.out.println("버스에 탄 사람의 수 : "+ passengerCount); 
		System.out.println("----------------------");	
		}			
		
	}

}
