package bookarr;

public class Book {
	String bookName;
	String author;
	
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
	
	public void getInfo() {
		System.out.println("å �̸���"+ bookName +"�̸�,");
		System.out.println("���ڴ�"+author+"�Դϴ�.");
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	
}
