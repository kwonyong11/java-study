package practice02;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Rectangle() {
		this.x1=0;
		this.x2=0;
		this.y1=0;
		this.y2=0;
	}
	
	public Rectangle(int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	
	public void set(int x1,int y1,int x2,int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public String toString() {
		return "left-bottom:("+x1+","+y1+") "
				+ "right-top:("+x2+","+y2+")";
	}
	
	public int square() {
		int height=x2-x1;
		int width=y2-y1;
		
		int square=height*width;
		
		return square;
	}
	
	public boolean equals(Rectangle r) {
		boolean result_bool;
		if(x1==r.x1 && y1==r.y1 && x2==r.x2 && y2==r.y2) {
			result_bool=true;
		}
		else {
			result_bool=false;
		}
		return result_bool;
	}
}
