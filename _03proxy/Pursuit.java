package wish.designmodel._03proxy;

class Pursuit implements GiveGift {
	
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm){
		this.mm = mm;
	}
	
	@Override
	public void GiveDolls() {
		System.out.println("Give Dolls to: " + mm.getName());
	}

	@Override
	public void GiveFlowers() {
		System.out.println("Give Flowers to: " + mm.getName());
	}

	@Override
	public void GiveChocolate() {
		System.out.println("Give Chocolate to: " + mm.getName());
	}

}
