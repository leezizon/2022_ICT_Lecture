
public class People {
	public String name = "�̸�����";
	public int age = 0;
	public int money = 0;
	public String job = "����";
	
	public People(String name,int age,int money,String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		
		System.out.println("-------�����ѻ��=-------");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�� : "+money);
		System.out.println("���� : "+job);
		System.out.println("----------------------");
		
	}
	
	public Boolean payFee (int price) {
		if (this.money > price) 
			return true;
		else
			return false;
	}
	
	public void takeBus() {
		Bus asd = Bus.getBusInstance();
		asd.takeBus(this);
	}
	
	public void takeSubway() {
		Subway asd = Subway.getSubwayInstance();
		asd.takeSubway(this);
	}
	
}
