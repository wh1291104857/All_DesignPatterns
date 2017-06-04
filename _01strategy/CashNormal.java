package wish.designmodel._01strategy;

class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
