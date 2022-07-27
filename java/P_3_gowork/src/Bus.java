
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
		if (people.job == "������"&&people.payFee(workFee)) {
			people.money -= this.workFee; 
			this.money += this.workFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("�������Դϴ�");
			System.out.println(people.name+"�� �ܾ� : "+people.money); 
			System.out.println("������ ���� : "+this.money); 
			System.out.println("������ ź ����� �� : "+ passengerCount);
			System.out.println("----------------------");
		}
		else if(people.job == "�л�"&&people.payFee(studentFee)) {
			people.money -= this.studentFee;
			this.money += this.studentFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("�л��Դϴ�");
			System.out.println(people.name+"�� �ܾ� : "+people.money); 
			System.out.println("������ ���� : "+this.money); 
			System.out.println("������ ź ����� �� : "+ passengerCount); 
			System.out.println("----------------------");
		}
		else {
		System.out.println("----------------------");
		System.out.println("�ܾ��� �����մϴ�");
		System.out.println(people.name+"�� �ܾ� : "+people.money); 
		System.out.println("������ ���� : "+this.money); 
		System.out.println("������ ź ����� �� : "+ passengerCount); 
		System.out.println("----------------------");	
		}			
		
	}

}
