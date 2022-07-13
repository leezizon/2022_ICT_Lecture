package extendEx;

public class People {
	private String name;
	private int age;
	private String grade;
	
	public People(String name, int age, String grade) {
		System.out.println("부모 생성자 호출");
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void setName(String name) { this.name = name;}
	public void setAge(int age) { this.age = age;}
	public void setGrade(String grade) { this.grade = grade;}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getGrade() {return grade;}
	
}
