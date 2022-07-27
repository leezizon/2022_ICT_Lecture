package extendEx;

public class Dev extends People {
	
	public Dev(String name, int age, String grade) {
		super(name,age,grade);
		
		System.out.println("자식 생성자 호출");
	}
	
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getGrade());
	}
}
