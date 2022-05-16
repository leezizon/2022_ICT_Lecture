
public class Rectangle {
	
	private int x = 0;
	private int y = 0;
	private int width = 0;
	private int height = 0;
	private Boolean a = null;
	
	public Rectangle(int x, int y, int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width*height;
	}

	public void show() {
		System.out.println("좌표 " +"("+x+","+y+")"+"에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	public Boolean contains(Rectangle r) {
		if(this.x <= r.x  && (r.x + r.width) <= (this.x + this.width)&&
				this.y<=r.y&&(r.y+r.height)<=(this.y+this.height))
			{a = true;}
		else
			{a = false;}
		return a;
	}
	
}
