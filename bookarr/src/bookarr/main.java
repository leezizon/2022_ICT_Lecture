package bookarr;

public class main {
	public static void main(String[] args) {
		
		Book[] library1 = new Book[3];
		Book[] library2 = new Book[3];
		
		library1[0] = new Book("å1","����1");
		library1[1] = new Book("å2","����2");
		library1[2] = new Book("å3","����3");
		
		System.arraycopy(library1, 0, library2, 0, 3);
		
		for(int i = 0; i <library2.length;i++) {
			library2[i].getInfo();
		}
		
		
		library1[0].setBookName("�ٸ�å");
		library1[0].setAuthor("�ٸ�����");
		System.out.println("library1[0]���� �ٲ�");
		
		
		for(int i = 0; i <library2.length;i++) {
			library1[i].getInfo();
		}
		
		System.out.println("library1[0]���� Ȯ��");
		
		for(int i = 0; i <library2.length;i++) {
			library2[i].getInfo();
		}
		//		Book[] library = new Book[5];
		
//		library[0] = new Book("�ظ�����","J.K �Ѹ�");
//		library[1] = new Book("�ظ�����2","J.K �Ѹ�");
//		library[2] = new Book("�ظ�����3","J.K �Ѹ�");
//		library[3] = new Book("�ظ�����4","J.K �Ѹ�");
//		library[4] = new Book("�ظ�����5","J.K �Ѹ�");
//		
//		for(int i = 0; i<library.length;i++) {
//			
//		}
	}
}
