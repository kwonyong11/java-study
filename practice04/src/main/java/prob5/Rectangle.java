package prob5;

public class Rectangle extends Shape implements Resize{
	private double width;
	private double height;
	public Rectangle(double w,double h) {
		super(4);
		this.width=w;
		this.height=h;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return width*2+height*2;
	}
	
	public void resize(double s) {
		width=width*s;
		height=height*s;
	}
}
