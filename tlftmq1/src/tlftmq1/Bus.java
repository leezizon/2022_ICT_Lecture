package tlftmq1;

public class Bus {
	
	private static Bus bus;
	
	private Bus() {
	}
	
	public static Bus getBusInstance() {
		if(bus == null) {
			bus = new Bus(); 
			System.out.println("----------------------");
			System.out.println("���� ���� ����");
			System.out.println("----------------------");
		}
		return bus;
	}
	
	private int money = 0;
	private int studentFee = 720;
	private int workFee = 1250;
	private int passengerCount = 0;
	
	public void takeBus(People people) {
		switch(people.job) {
		case"������":
			if(people.payFee(workFee)) {
				people.money -= this.workFee; 
				this.money += this.workFee;
				passengerCount++;
				System.out.println("----------------------");
				System.out.println("�������Դϴ�");
				break;
			}else {
				System.out.println("----------------------");
				System.out.println("�ܾ׺���");	
			}
		
		case"�л�":
			if(people.payFee(studentFee)) {
				people.money -= this.studentFee; 
				this.money += this.studentFee;
				passengerCount++;
				System.out.println("----------------------");
				System.out.println("�л��Դϴ�");
				break;
			}else {
				System.out.println("----------------------");
				System.out.println("�ܾ׺���");	
			}
		}
		
		System.out.println(people.name+"�� �ܾ� : "+people.money); 
		System.out.println("������ ���� : "+this.money); 
		System.out.println("������ ź ����� �� : "+ passengerCount); 
		System.out.println("----------------------");
	}
	
}
