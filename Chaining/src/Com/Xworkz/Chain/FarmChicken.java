package Com.Xworkz.Chain;

public class FarmChicken extends Chicken{
	
	
	int noOfDays;
	String careTaker;
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker)
	{
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}
	@Override
	void printInfo()
	{
		System.out.println("Running printInfo method in FarmChicken..");
		System.out.println(this.noOfDays);
		System.out.println(this.careTaker);
		super.printInfo();
		
	}
	

}
