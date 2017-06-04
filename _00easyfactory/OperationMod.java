package wish.designmodel._00easyfactory;

public class OperationMod extends Operation {

	@Override
	public double GetResult() {
		return super.getNumberA()%super.getNumberB();
	}

}
