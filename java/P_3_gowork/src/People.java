
public class People {
	public String name = "이름없음";
	public int age = 0;
	public int money = 0;
	public String job = "없음";
	
	public People(String name,int age,int money,String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		
		System.out.println("-------생성한사람=-------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("돈 : "+money);
		System.out.println("직업 : "+job);
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
