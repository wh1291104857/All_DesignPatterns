package wish.designmodel._01strategy;

public class CashHalf extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money*0.5;
	}

}
