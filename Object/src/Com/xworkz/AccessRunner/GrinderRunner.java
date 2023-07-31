package Com.xworkz.AccessRunner;

import Com.xworkz.Access.Grinder;

public class GrinderRunner {
	public static void main(String[] args) {
		Grinder grinder=new Grinder();
		System.out.println(grinder);
		grinder.setBrand("LG");
		grinder.setColor("white");
		grinder.setPrice(2000);
		grinder.setSpeed("high");
		System.out.println(grinder);

	}
}
