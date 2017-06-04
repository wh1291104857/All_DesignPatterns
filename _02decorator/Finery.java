package wish.designmodel._02decorator;

/**
 * �̳в��ϳ���Person
 */
class Finery extends Person {

	protected Person component;
	
	public void Decorate(Person component){
		this.component = component;//*****�������ϴ�װ�κ��component���룬�������װ�Σ�������Show�����е�super.Show()���ã�
								   //*****����ѡ�񡢰�˳���ʹ��װ�ι��ܰ�װ����
	}
	
	@Override
	public void Show() {
		if(component != null){
			component.Show();
		}
	}

}
