package Com.Xworkz.Task;

public class Director {
	
	String name;
	String awards;
	String nationality;
	String dateOfBirth;
	
	Director()
	{
		System.out.println("Running no-args const in Movie..");
	}
	Director(String name,String awards,String nationality,String dateOfBirth)
	{
		System.out.println("Running String,String,String,String consts in Movie..");
		this.name=name;
		this.awards=awards;
		this.nationality=nationality;
		this.dateOfBirth=dateOfBirth;
	}
	void printInfo()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Awards :"+this.awards);
		System.out.println("Nationality :"+this.nationality);
		System.out.println("dateOfBirth :"+this.dateOfBirth);
	}

}
