package practice02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int GOODS_COUNT=3;
		
		Goods[] goods=new Goods[GOODS_COUNT];
		
		Scanner scanner=new Scanner(System.in);
		//저장
		for(int i=0;i<GOODS_COUNT;i++) {
			String info = scanner.nextLine();
			String[] infos = info.split(" ");
			String name=infos[0];
			int price = Integer.parseInt(infos[1]);
			int stockCount=Integer.parseInt(infos[2]);
			goods[i]=new Goods(name, price, stockCount);
		}
		
		
		//출력
		for(int i=0;i<GOODS_COUNT;i++) {
			System.out.println(goods[i].show());
		}
		scanner.close();
	}
	
	
}
