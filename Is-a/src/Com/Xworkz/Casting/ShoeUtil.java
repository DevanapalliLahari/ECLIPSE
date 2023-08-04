package Com.Xworkz.Casting;

public class ShoeUtil {
	
	static void Buy(Shoe shoe)
	{
		System.out.println("Running ShoeUtil...");
		if(shoe !=null)
		{
			System.out.println("Runnin");
			}
		else {
			System.out.println("give valid shoe");
		}
			if(shoe instanceof PumaShoe)
			{
				PumaShoe pumaShoe=(PumaShoe)shoe;
				pumaShoe.printInfo();
				
			}
			if(shoe instanceof NikeShoe)
			{
				NikeShoe nikeShoe=(NikeShoe)shoe;
				nikeShoe.printInfo();
			}
		}
		
	}


