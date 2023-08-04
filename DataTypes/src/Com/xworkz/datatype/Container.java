package Com.xworkz.datatype;

public class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		int value = Integer.bitCount(number);
		System.out.println("value:" + value);
		int number1 = 7;
		int number2 = 4;
		int value1 = Integer.compare(7, 4);
		System.out.println("value1:" + value1);
		int value2 = Integer.max(7, 4);
		System.out.println("value2:" + value2);
		String name = "6543";
		int name1 = Integer.decode("6543");
		System.out.println(name1);
		int name2 = Integer.parseInt("6543");
		System.out.println(name2);
		Container container=new Container();
		
	}

}
