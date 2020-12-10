package prob3;

public class Prob3 {
	
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
			System.out.print(result);
		}
	}
	
	public static void main(String[] args) {
		String str="Hello World";
		char[] reverseStr=reverse(str);
		printCharArray(reverseStr);
		
		System.out.println();
		
		str="Java Programming!";
		reverseStr=reverse(str);
		printCharArray(reverseStr);
	}

}
