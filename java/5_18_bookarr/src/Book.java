
public class Book {
	String bookName;
	String author;
	
	public Book() {
		
	}
	
	public Book(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String _bookName) {
		this.bookName = _bookName;
	}
	
	public void setAuthor(String _author) {
		this.author = _author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void showInfo() {
		System.out.println("å �̸��� "+ bookName +" �̸�,");
		System.out.println("���ڴ� "+author+" �Դϴ�.");
	}
}
