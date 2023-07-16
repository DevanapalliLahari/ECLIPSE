package Com.Xworkz.Task;

public class Franchise {
	String miFranchise;
	String rcbFranchise;
	String gujaratFranchise;
	String rrFranchise;
	
	
	Franchise()
	{
		System.out.println("Running no-args const in Franchise...");
	}
	Franchise(String miFranchise,String rcbFranchise,String gujaratFranchise,String rrFranchise)
	{
		System.out.println("Running String,String,String,String consts in Franchise..");
		this.miFranchise=miFranchise;
		this.rcbFranchise=rcbFranchise;
		this.gujaratFranchise=gujaratFranchise;
		this.rrFranchise=rrFranchise;
	}
	void printInfo()
	{
		System.out.println("MIFranchise :"+miFranchise);
		System.out.println("RCBFranchise :"+rcbFranchise);
		System.out.println("GujaratFranchise :"+gujaratFranchise);
		System.out.println("RRFranchise :"+rrFranchise);
	}

}



