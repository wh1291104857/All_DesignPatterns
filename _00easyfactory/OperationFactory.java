package wish.designmodel._00easyfactory;

public class OperationFactory {
	
	//Operation������ʹ�ø���Operation����numberA��super.getNumberA()����numberB�ķ�������numberA��numberB��ֵ
	public static Operation GetOperation(String operator){
		if(operator.equals("+"))//String�����޷�ʹ��switch
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
