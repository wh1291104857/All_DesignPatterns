package wish.designmodel._02decorator;

/**
 * 装饰模式是为已有功能动态地添加更多功能的一种方式，比生成子类更为灵活
 */
public class TestDecorator {

	public static void main(String[] args) {
		Person p = new Person("xiaoWang");
		TShirts ts = new TShirts();
		Suit s = new Suit();
		BigTrouser bt = new BigTrouser();
		Coat c=new Coat();
		
		ts.Decorate(p);
		s.Decorate(ts);
		bt.Decorate(s);
		c.Decorate(bt);
		bt.Show();
		c.Show();
	}

}
