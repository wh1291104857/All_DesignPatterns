package wish.designmodel._02decorator;

class Person {
	public Person(){}
	
	private String name;
	public Person(String name){
		this.name = name;
	}
	
	public void Show(){
		System.out.println("Decoratored:" + name);
	}
}
