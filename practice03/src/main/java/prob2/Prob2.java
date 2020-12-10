package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		int[] moneyCount=new int[9];
		int[] units= {50000,10000,5000,1000,500,100,50,10,1};
		int count=0;
		System.out.print("금액: ");
		Scanner scan=new Scanner(System.in);
		int money=scan.nextInt();
		
		while(money>0) {
			moneyCount[count]=money/units[count];
			money-=moneyCount[count]*units[count];
			count++;
		}
		
		for(int i=0;i<moneyCount.length;i++) {
			System.out.println(units[i]+"원권"+" : "+moneyCount[i]+"개");
		}
		
		scan.close();
	}

}
