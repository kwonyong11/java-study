package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] moneyCount=new int[10];
		int[] price= {50000,10000,5000,1000,500,100,50,10,5,1};
		int count=0;
		System.out.print("금액: ");
		Scanner scan=new Scanner(System.in);
		int money=scan.nextInt();
		
		while(money>0) {
			moneyCount[count]=money/price[count];
			money-=moneyCount[count]*price[count];
			count++;
		}
		
		for(int i=0;i<moneyCount.length;i++) {
			System.out.println(price[i]+"원"+" : "+moneyCount[i]+"개");
		}
	}

}
