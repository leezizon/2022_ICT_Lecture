
public class Subway {
	private static Subway subway;
	
	private Subway() {
		
	}
	
	public static Subway getSubwayInstance() {
		if(subway == null) {
			subway = new Subway ();
			System.out.println("----------------------");
			System.out.println("����ö ���� ����");
			System.out.println("----------------------");
		}
		return subway ;
	}
	
	
	private int money = 0;
	private int studentFee = 720;
	private int workFee = 1250;
	private int passengerCount = 0;
	
	public void takeSubway(People people) {
		if (people.job == "������"&&people.payFee(studentFee)) {
			people.money -= this.workFee; 
			this.money += this.workFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("�������Դϴ�");
			System.out.println(people.name+"�� �ܾ� : "+people.money); 
			System.out.println("����ö�� ���� : "+this.money); 
			System.out.println("����ö�� ź ����� �� : "+ passengerCount);
			System.out.println("----------------------");
		}
		else if(people.job == "�л�"&&people.payFee(studentFee)) {
			people.money -= this.studentFee;
			this.money += this.studentFee;
			passengerCount++;
			System.out.println("----------------------");
			System.out.println("�л��Դϴ�");
			System.out.println(people.name+"�� �ܾ� : "+people.money); 
			System.out.println("����ö�� ���� : "+this.money); 
			System.out.println("����ö�� ź ����� �� : "+ passengerCount); 
			System.out.println("----------------------");
		}
		else {
		System.out.println("----------------------");
		System.out.println("�ܾ��� �����մϴ�");
		System.out.println(people.name+"�� �ܾ� : "+people.money); 
		System.out.println("����ö�� ���� : "+this.money); 
		System.out.println("����ö�� ź ����� �� : "+ passengerCount); 
		System.out.println("----------------------");	
		}	
	}


}
