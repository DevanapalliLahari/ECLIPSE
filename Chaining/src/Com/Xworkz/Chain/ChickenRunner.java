package Com.Xworkz.Chain;

public class ChickenRunner {

	public static void main(String[]args)
	{
	
	Chicken chicken=new Chicken(200,"Btm");
	chicken.printInfo();
	
	FarmChicken farm=new FarmChicken(150,"Jaynagar",45,"ABC");
	farm.printInfo();
	
	BroilerChicken chicken1=new BroilerChicken(230,"VVnagar",true,2);
	chicken1.printInfo();
	}

}
