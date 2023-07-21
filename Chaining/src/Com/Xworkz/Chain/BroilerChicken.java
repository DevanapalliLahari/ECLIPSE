package Com.Xworkz.Chain;

public class BroilerChicken extends Chicken{
	
	boolean alive;
	int weight;
	
	
	public BroilerChicken(int price, String location, boolean alive, int weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;
	}
	@Override
	void printInfo()
	{
		System.out.println("Running printInfo method in BroilerChicken...");
		System.out.println(alive);
		System.out.println(weight);
		super.printInfo();
		
	}
	

}
