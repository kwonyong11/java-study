package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String str=scan.nextLine();
		String result="";
		for(int c=0;c<str.length();c++) {
			result+=str.charAt(c);
			System.out.println(result);
		}
	}

}
