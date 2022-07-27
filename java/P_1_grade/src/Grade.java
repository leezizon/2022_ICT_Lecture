
public class Grade {
	
	private int math;
	private int science;
	private int english;
	private int result;
	
	public Grade(int math,int science,int english){
	
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		result = (math+science+english)/3;
		return result;
	}
}
