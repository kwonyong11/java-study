package parksystem3;

public abstract class Car implements IParkable{
	
	public void brake() {
		System.out.println("브레이크를 밟았습니다.");
	}
}
