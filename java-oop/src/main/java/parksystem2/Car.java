package parksystem2;

public abstract class Car {
	
	public void brake() {
		System.out.println("브레이크를 밟았습니다.");
	}
	public abstract void park();
}
