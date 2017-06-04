package wish.designmodel._00easyfactory;

class OperationSub extends Operation {

	@Override
	public double GetResult() {
		return super.getNumberA() - super.getNumberB();
	}
}
