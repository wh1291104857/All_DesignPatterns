package wish.designmodel._02decorator;

/**
 * 继承并合成了Person
 */
class Finery extends Person {

	protected Person component;
	
	public void Decorate(Person component){
		this.component = component;//*****将经过上次装饰后的component传入，进行这次装饰（在子类Show方法中的super.Show()调用）
								   //*****可有选择、按顺序地使用装饰功能包装对象
	}
	
	@Override
	public void Show() {
		if(component != null){
			component.Show();
		}
	}

}
