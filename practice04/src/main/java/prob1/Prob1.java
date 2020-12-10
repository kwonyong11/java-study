package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		//무한루프
		while(true) {
			System.out.print( "숫자를 입력하세요. :" );
			int inputNumber = scanner.nextInt();
			int result=0;
			int check=0;
			if(inputNumber%2==0) {
				check=2;
			}
			else {
				check=1;
			}
			for(int i=check;i<=inputNumber;i+=2) {
				result+=i;
			}
			System.out.println("결과 값 : "+result);
		}
		
	}

}
