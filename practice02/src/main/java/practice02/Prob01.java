package practice02;

public class Prob01 {
	
	public static void replaceSpace(char a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
	}
	
	public static void printCharArray(char a[]) {
		for(char result:a) {
			System.out.print(result);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
