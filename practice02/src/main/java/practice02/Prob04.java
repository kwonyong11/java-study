package practice02;

public class Prob04 {
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   CurrencyConverter.setRate(1084.52);
	   
	   double w1=1000000;
	   double d1=CurrencyConverter.toDollar(w1);
	   System.out.println("백만원은 "+d1+"달러입니다.");
	   
	   double d2=100;
	   double w2=CurrencyConverter.toKWR(d2);
	   System.out.println("백달러는 "+w2+"원입니다.");
   }

}
