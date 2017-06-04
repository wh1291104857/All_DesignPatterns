package wish.designmodel._00easyfactory;

/**
 * *****用单独的工厂类来创建实例（客户端告诉工厂类要什么(传入类型参数)，工厂类就返回对应的实例）
 */
class TestEasyFactory {

	public static void main(String[] args) {
		Operation o = OperationFactory.GetOperation("%");
		o.setNumberA(100);
		o.setNumberB(12);
		double result = o.GetResult();
		System.out.println(result);
	}

}
