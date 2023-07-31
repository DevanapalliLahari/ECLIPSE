package Com.xworkz.app.runner;

import Com.xworkz.app.Security;
public class SecurityRunner {

	public static void main(String[] args) {
		
		System.out.println("main");
		Security security=new Security();
		System.out.println(security);
		Object object=new Security();
		System.out.println(object.toString());
		// TODO Auto-generated method stub

	}

}
