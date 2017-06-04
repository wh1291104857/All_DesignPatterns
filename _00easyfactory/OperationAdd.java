package wish.designmodel._00easyfactory;

class OperationAdd extends Operation {

	@Override
	public double GetResult() {
		return super.getNumberA() + super.getNumberB();
	}
}
