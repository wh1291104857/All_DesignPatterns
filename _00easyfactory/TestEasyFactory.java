package wish.designmodel._00easyfactory;

/**
 * *****�õ����Ĺ�����������ʵ�����ͻ��˸��߹�����Ҫʲô(�������Ͳ���)��������ͷ��ض�Ӧ��ʵ����
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
