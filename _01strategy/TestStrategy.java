package wish.designmodel._01strategy;

/**
 * ����CashSuper�������ͬ�Ĺ�����ֻ��ʵ�ֲ�ͬ������ͬ�ķ�ʽ�������е��㷨��
 * �����˸����㷨����ʹ���㷨��֮�����ϡ�
 * 
 * Strategyģʽ��򵥹���ģʽ������
 * Strategyģʽ�Ŀͻ���ֻ����ʶCashContext�࣬�򵥹���ģʽ�Ŀͻ�����Ҫ��ʶ
 * CashFactory���CashSuper�࣬Strategyģʽ����ϸ��ӽ��͡�
 */
class TestStrategy {
	
	public static void main(String[] args) {

		CashContext cc = new CashContext("half");
		double result = cc.GetResult(750);
		System.out.println(result);
	}

}
