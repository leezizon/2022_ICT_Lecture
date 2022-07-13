package bookarr;

public class main {
	public static void main(String[] args) {
		
		Book[] library1 = new Book[3];
		Book[] library2 = new Book[3];
		
		library1[0] = new Book("책1","저자1");
		library1[1] = new Book("책2","저자2");
		library1[2] = new Book("책3","저자3");
		
		System.arraycopy(library1, 0, library2, 0, 3);
		
		for(int i = 0; i <library2.length;i++) {
			library2[i].getInfo();
		}
		
		
		library1[0].setBookName("다른책");
		library1[0].setAuthor("다른저자");
		System.out.println("library1[0]정보 바꿈");
		
		
		for(int i = 0; i <library2.length;i++) {
			library1[i].getInfo();
		}
		
		System.out.println("library1[0]정보 확인");
		
		for(int i = 0; i <library2.length;i++) {
			library2[i].getInfo();
		}
		//		Book[] library = new Book[5];
		
//		library[0] = new Book("해리포터","J.K 롤링");
//		library[1] = new Book("해리포터2","J.K 롤링");
//		library[2] = new Book("해리포터3","J.K 롤링");
//		library[3] = new Book("해리포터4","J.K 롤링");
//		library[4] = new Book("해리포터5","J.K 롤링");
//		
//		for(int i = 0; i<library.length;i++) {
//			
//		}
	}
}
