package prob2;

public class Money {
	int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
    	int result=this.amount+money.amount;
        return new Money(result);
    }
    public Money minus(Money money) {
        //빼기 구현
    	int result=this.amount-money.amount;
        return new Money(result);
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	int result=this.amount*money.amount;
        return new Money(result);
    }
    public Money devide(Money money) {
        //나누기 구현
    	int result=this.amount/money.amount;
        return new Money(result);
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	} 
    
}
