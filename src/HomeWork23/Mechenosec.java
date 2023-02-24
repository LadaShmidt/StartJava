package HomeWork23;

public  class Mechenosec extends Fish{
	Mechenosec(String name){
		super(name);
		this.name = name;
	}
	@Override
	public void swim() {
	System.out.println("Mechenosec is so beautiful fish and she so beautiful swims");		
	}
	@Override
	public void eat() {
		System.out.println("Mechenosec eats a food for fish");
	}

}
