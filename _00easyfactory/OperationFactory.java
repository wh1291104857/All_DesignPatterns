package wish.designmodel._00easyfactory;

public class OperationFactory {
	
	//Operation的子类使用父类Operation设置numberA（super.getNumberA()）和numberB的方法，给numberA和numberB赋值
	public static Operation GetOperation(String operator){
		if(operator.equals("+"))//String类型无法使用switch
			return new OperationAdd();
		else if(operator.equals("-"))
			return new OperationSub();
		else if(operator.equals("*"))
			return new OperationMul();
		else if(operator.equals("/"))
			return new OperationDiv();
		else if(operator.equals("%"))
			return new OperationMod();
		return null;
	}
}
