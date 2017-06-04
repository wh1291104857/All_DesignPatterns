package wish.designmodel._00easyfactory;

class OperationMul extends Operation {
	
	@Override
	public double GetResult() {
		return super.getNumberA() * super.getNumberB();
	}
}
