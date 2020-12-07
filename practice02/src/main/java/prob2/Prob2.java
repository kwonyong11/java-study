package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int intArray[]=new int[5];
		double sum=0;
		
		System.out.println(intArray.length+"개의 숫자를 입력하세요.");
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=scan.nextInt();
		}
		for(int i:intArray) {
			sum+=i;
		}
		
		double avg=sum/intArray.length;
		System.out.println(avg);
	}

}
