package extendEx;

public class Dev extends People {
	
	public Dev(String name, int age, String grade) {
		super(name,age,grade);
		
		System.out.println("�ڽ� ������ ȣ��");
	}
	
	public void showInfo() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getGrade());
	}
}
