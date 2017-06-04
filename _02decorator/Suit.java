package wish.designmodel._02decorator;

public class Suit extends Finery {
	@Override
	public void Show() {
		System.out.println("Suit");
		super.Show();//
	}
}
