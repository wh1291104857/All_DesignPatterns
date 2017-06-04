package wish.designmodel._00easyfactory;

/**
 * 抽象出所有运算类的共用部分
 */
public abstract class Operation {
	private double numberA;
	private double numberB;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	public abstract double GetResult();
}
