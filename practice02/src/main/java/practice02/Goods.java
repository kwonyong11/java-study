package practice02;

public class Goods {
	private String name;
	private int price;
	private int stockCount;
	
	public Goods(String name,int price, int stockCount){
		this.name=name;
		this.price=price;
		this.stockCount=stockCount;
	}
	
	public String show() {
		return name+"(가격:"+price+"원)이 "+stockCount+"개 입고되었습니다.";
	}
}
