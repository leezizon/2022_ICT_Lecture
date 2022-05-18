
public class main {
	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		Book[] books2 = new Book[5];
		Book[] books3 = new Book[5];
		
		books[0] = new Book("책1","저자1");
		books[1] = new Book("책2","저자2");
		books[2] = new Book("책3","저자3");
		books[3] = new Book("책4","저자5");
		books[4] = new Book("책5","저자5");
		
		System.arraycopy(books, 0, books2, 0, 5);
		
		for(int i = 0; i < books.length; i++) {
			books3[i] = new Book();	
		}
		
		System.out.println(books[1].hashCode());	
		System.out.println(books2[1].hashCode());
		
		for(int i = 0; i < books.length; i++) {
			books3[i].setBookName(books[i].getBookName());
			books3[i].setAuthor(books[i].getAuthor());
		}
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books3[i].getBookName()+" "+books3[i].getAuthor());
				
		}
		
//		Book book1 = new Book("책1","저자1");
//		Book book2 = new Book("책2","저자2");
//		
//		System.out.println(book1.hashCode());
//		System.out.println(book2.hashCode());
//		
//		book2.setBookName(book1.getBookName());
//		book2.setAuthor(book1.getAuthor());
//		book2.showInfo();
//		
//		book2.getInfo();
//		book2=book1;
//		book2.getInfo();
//		book1.setAuthor("다른저자");
//		book1.setBookName("다른책");
//		book2.getInfo();
		
//		int a = 5;
//		int b = 6;
//		
//		b = a;
//		System.out.println(a);
//		System.out.println(b);
//		
//		a = 6; 
//		System.out.println(b);
//		
		
	}
		
	
}
