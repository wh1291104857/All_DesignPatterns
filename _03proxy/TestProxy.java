package wish.designmodel._03proxy;

/**
 * ����ģʽΪ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
 * 
 * ���������ʵ����Ĵ���
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
