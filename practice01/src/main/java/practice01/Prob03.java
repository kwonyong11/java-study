package practice01;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		for(int i=1;i<100;i++) {
			str=Integer.toString(i);
			int check=0;
			if(str.length()==1) {
				if(i%3==0) {
					System.out.println(str+" 짝");
				}
			}
			else if((str.charAt(str.length()-1)=='0')&&i%3!=0) {
				continue;
			}
			else if((str.charAt(0)-'0')%3==0||(str.charAt(1)-'0')%3==0){
				System.out.print(str);
				while(check<str.length()) {
					if(str.charAt(check)=='3'||str.charAt(check)=='6'||str.charAt(check)=='9') {
						System.out.print(" 짝");
						
					}
					check++;
				}
				System.out.println();
			}
			else {
				continue;
			}
			
		}
	}

}
