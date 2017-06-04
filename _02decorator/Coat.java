package wish.designmodel._02decorator;

public class Coat extends Finery {
	@Override
	public void Show() {
		System.out.println("Coat");
		super.Show();
	}
}
