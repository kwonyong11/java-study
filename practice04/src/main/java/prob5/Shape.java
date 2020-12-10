package prob5;

public abstract class Shape {
	int numSides;
	public Shape(int numSides) {
		this.numSides=numSides;
		
	}
	
	
	public int getNumSides() {
		return numSides;
	}
	abstract double getArea();
	abstract double getPerimeter();
}
