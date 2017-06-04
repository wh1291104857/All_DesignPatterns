package wish.designmodel._01strategy;

class CashContext {
	CashSuper cs = null;
	
	public CashContext(String type){//可使用反射技术解决分支问题
		if(type.equals("Normal"))
			cs = new CashNormal();
		else if(type.equals("300Back100"))
			cs = new CashReturn("300", "100");
		else if(type.equals("8off"))
			cs = new CashRebate("0.8");
		else if(type.equals("half"))
			cs = new CashHalf();
	}
	
	public double GetResult(double money){//此方法将CashSuper类对客户端隐藏
		if(cs != null){
			return cs.acceptCash(money);
		}
		return 0;
	}
}
