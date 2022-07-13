package tlftmq1;

public class Subway {
	private static Subway subway;
	
	private Subway() {
		
	}
	
	public static Subway getSubwayInstance() {
		if(subway == null) {
			subway = new Subway ();
			System.out.println("----------------------");
			System.out.println("지하철 최초 생성");
			System.out.println("----------------------");
		}
		return subway ;
	}
	
	private int money = 0;
	private int studentFee = 720;
	private int workFee = 1250;
	private int passengerCount = 0;
	
	public void takeSubway(People people) {
		switch(people.job) {
		case"직장인":
			if(people.payFee(workFee)) {
				people.money -= this.workFee; 
				this.money += this.workFee;
				passengerCount++;
				System.out.println("----------------------");
				System.out.println("직장인입니다");
				break;
			}else {
				System.out.println("----------------------");
				System.out.println("잔액부족");	
			}
		
		case"학생":
			if(people.payFee(studentFee)) {
				people.money -= this.studentFee; 
				this.money += this.studentFee;
				passengerCount++;
				System.out.println("----------------------");
				System.out.println("학생입니다");
				break;
			}else {
				System.out.println("----------------------");
				System.out.println("잔액부족");	
			}
		}
		
		
		System.out.println(people.name+"의 잔액 : "+people.money); 
		System.out.println("지하철의 수입 : "+this.money); 
		System.out.println("지하철에 탄 사람의 수 : "+ passengerCount); 
		System.out.println("----------------------");
	}
	
}
