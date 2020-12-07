package prob3;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num=scan.nextInt();
		int result=0;
		int check=0;
		if(num%2==0) {
			check=2;
		}
		else {
			check=1;
		}
		for(int i=check;i<=num;i+=2) {
			result+=i;
		}
		System.out.println("결과 값 : "+result);
	}

}
