import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char ch = 'a';
		boolean isSupport = true;
		Scheduler scheculer = null;
		Scanner scan = new Scanner(System.in);
		
		ch = scan.next().charAt(0);
		
		if(ch =='R'||ch =='r') {
			scheculer = new RoundRobin();
		}else if(ch =='L'||ch =='l') {
			scheculer = new LeastJob();
		}else if(ch =='P'||ch =='p') {
			scheculer = new priorityAllocation();
		}else {
			System.out.println("지원하지 않는 기능입니다");
			isSupport = false;
		}
		
		if(isSupport == true) {
			scheculer.getNextCall();
			scheculer.sendCallAgent();
		}
		scan.close();
	}
	
}
