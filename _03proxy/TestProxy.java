package wish.designmodel._03proxy;

/**
 * 代理模式为其他对象提供一种代理以控制对这个对象的访问。
 * 
 * 代理就是真实对象的代表
 */
public class TestProxy {

	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl();
		mm.setName("JiaoJiao Li");
		Proxy p = new Proxy(mm);
		p.GiveChocolate();
		p.GiveDolls();
		p.GiveFlowers();
	}

}
