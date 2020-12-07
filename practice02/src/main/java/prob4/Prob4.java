package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str=scan.nextLine();
		
		char[] reverseStr=reverse(str);
		printCharArray(reverseStr);
	}
	
	public static char[] reverse(String str) {
		int strLen=str.length();
		char[] character=new char[strLen];
		character=str.toCharArray();

		for(int i=0;i<strLen/2;i++) {
			char temp=' ';
			temp=character[i];
			character[i]=character[strLen-i-1];
			character[strLen-i-1]=temp;
			
		}
		return character;
	}
	
	public static void printCharArray(char[] array) {
		for(char result:array) {
			System.err.print(result);
		}
	}
}
