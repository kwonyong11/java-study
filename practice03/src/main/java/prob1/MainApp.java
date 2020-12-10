package prob1;

public class MainApp {

	public static void main(String[] args) {
		int[] data= {1,3,5,8,9,11,15,19,18,20,30,33,31};
		
		int sum=0;
		int count=0;
		/* 코드 추가 */
		for(int i : data) {
			if(i%3==0) {
				sum+=i;
				count++;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+count);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+sum);
	}

}
