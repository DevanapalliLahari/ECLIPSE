package Com.Xworkz.Casting;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Shoe shoe1 =new PumaShoe("Jack Black","Germany",1000,ShoeSize.EIGHT,ShoeColor.WHITE);
		ShoeUtil.Buy(shoe1);
		
		Shoe shoe2=new NikeShoe("Mark","Kunal Rajput",1500,ShoeSize.SEVEN,ShoeColor.BLACK);
		ShoeUtil.Buy(shoe2);
		

	}

}
