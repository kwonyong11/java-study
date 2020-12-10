package practice01;

import java.util.Random;
import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int k=r.nextInt(100)+1;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		Scanner scan=new Scanner(System.in);
		boolean isContinue=true;
		int count=1;
		
		int min=1;
		int max=100;
		
		while(isContinue) {
			System.out.println(min+"-"+max);
			System.out.print(count+">>");
			int num=scan.nextInt();
			if(num>k) {
				System.out.println("더 낮게");
				max=num;
			}
			else if(num<k) {
				System.out.println("더 높게");
				min=num;
			}
			else {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String re=scan.next();
				if(re.equals("n")) {
					isContinue=false;
				}
			}
			count++;
		}
		
		System.out.println("종료합니다.");
	}

}
