package wish.designmodel._03proxy;

public class Proxy implements GiveGift {
	
	Pursuit gg;
	public Proxy(SchoolGirl mm){
		gg = new Pursuit(mm);//*****由Proxy与SchoolGirl打交道，Pursuit不用在客户端出现
	}
	
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();
	}

}
