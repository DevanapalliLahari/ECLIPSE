package Com.Xworkz.Task;

public class IplTeam {
	
	String name;
	int noOfPlayers;
	int noOfAllrounders;
	int wicketsTaken;
	
	Franchise franchise=new Franchise("Reliance Industries","United Spirits","CVC Capital Partners","Emerging Media Pvt.Ltd");
	
	IplTeam()
	{
		System.out.println("Running no-arg const in IplTeam");
	}
	IplTeam(String name,int noOfPlayers,int noOfAllrounders,int wicketsTaken)
	{
		System.out.println("Running String,int,int,int consts in IplTeam");
		this.name=name;
		this.noOfPlayers=noOfPlayers;
		this.noOfAllrounders=noOfAllrounders;
		this.wicketsTaken=wicketsTaken;
	}
	void printInfo()
	{
		System.out.println("Name :"+name);
		System.out.println("NoOfAllrounders :"+noOfAllrounders);
		System.out.println("NoOfPlayers :"+noOfPlayers);
		System.out.println("WicketsTaken :"+wicketsTaken);
		this.franchise.printInfo();
	}
	

}
