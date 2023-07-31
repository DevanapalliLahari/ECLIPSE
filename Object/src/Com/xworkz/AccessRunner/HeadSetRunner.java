package Com.xworkz.AccessRunner;

import Com.xworkz.Access.HeadSet;

public class HeadSetRunner {
	public static void main(String[] args) {
		HeadSet headSet=new HeadSet();
		System.out.println(headSet);
		headSet.setBrand("Boat");
		headSet.setColor("Black");
		headSet.setPrice(2000);
		headSet.setRating(4);
		System.out.println(headSet);

	}
}
