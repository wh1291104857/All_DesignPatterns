package wish.designmodel._01strategy;

/**
 * 所有CashSuper类完成相同的工作，只是实现不同，以相同的方式调用所有的算法，
 * 减少了各种算法类与使用算法类之间的耦合。
 * 
 * Strategy模式与简单工厂模式的区别：
 * Strategy模式的客户端只需认识CashContext类，简单工厂模式的客户端需要认识
 * CashFactory类和CashSuper类，Strategy模式的耦合更加降低。
 */
class TestStrategy {
	
	public static void main(String[] args) {

		CashContext cc = new CashContext("half");
		double result = cc.GetResult(750);
		System.out.println(result);
	}

}
