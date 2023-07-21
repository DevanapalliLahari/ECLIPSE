package Com.Xworkz.Chain;

public class Chicken {
	
	int price;
	String location;
	
	
	public Chicken(int price, String location) {
		this.price = price;
		this.location = location;
	}
	
	void printInfo()
	{
		System.out.println("Running printInfo method in Chicken..");
		System.out.println(this.price);
		System.out.println(this.location);
		
	}
	
	
	

}
