package extendEx;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		System.out.println("부모 생성자 호출");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
}
