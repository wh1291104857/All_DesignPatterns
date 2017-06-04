package wish.designmodel._00easyfactory;

class OperationDiv extends Operation {
	
	@Override
	public double GetResult() {
		if(super.getNumberB() == 0)
			return 0;
		return super.getNumberA() / super.getNumberB();
	}
}
