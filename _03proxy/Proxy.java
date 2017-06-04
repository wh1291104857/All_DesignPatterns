package wish.designmodel._03proxy;

public class Proxy implements GiveGift {
	
	Pursuit gg;
	public Proxy(SchoolGirl mm){
		gg = new Pursuit(mm);//*****��Proxy��SchoolGirl�򽻵���Pursuit�����ڿͻ��˳���
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
