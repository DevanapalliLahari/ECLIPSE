package Com.Xworkz.Task;

public class Owner {
	
	int investment;
	String name;
	String address;
	String gender;
	
	Owner()
	{
		System.out.println("Running no-args const in Owner");
	}
	Owner(int investment,String name,String address,String gender)
	{
		System.out.println("Running int,String,String,String consts in Owner");
		this.investment=investment;
		this.name=name;
		this.address=address;
		this.gender=gender;
	}
	void printInfo()
	{
		System.out.println("Investment :"+investment);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Gender :"+gender);
	}

}
