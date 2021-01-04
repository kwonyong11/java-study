package exception;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int i=10;
		int k=0;
		try {
			System.out.println("some codes...");
			k=9999/(i-10);
			System.out.println("some codes...2");
		}catch(ArithmeticException ex) {
			// 1. 사과
			System.out.println("프로그램이 예기치 않는 문제가 생겼습니다.");
			// 2. 로그 남기기
			System.out.println(ex);
			// 3. 정상종료
			return;
		}finally {
			System.out.println("some codes3");
		}

		System.out.println("some codes4");
	}

}
