package Com.xworkz.app.runner;

import Com.xworkz.app.Lotus;
public class LotusRunner {
	public static void main(String[] args)
	{
		System.out.println("main");
		Lotus lotus=new Lotus();
		System.out.println(lotus);
		Object object =new Lotus();
		System.out.println(object.toString());
	}

}
