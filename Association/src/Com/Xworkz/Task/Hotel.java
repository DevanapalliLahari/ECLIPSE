package Com.Xworkz.Task;

public class Hotel {
	
	String hotelName;
	String location;
	int capacity;
	String roomType;
	
	
	Owner owner=new Owner(900000,"John","Bangalore","Male");
	
	Hotel()
	{
		System.out.println("Running no-args const in Hotel");
	}
	Hotel(String hotelName,String location,int capacity,String roomType)
	{
		System.out.println("Running String,String,int,String consts in Hotel");
		this.hotelName=hotelName;
		this.location=location;
		this.capacity=capacity;
		this.roomType=roomType;
	}
	void printInfo()
	{
		System.out.println("HotelName :"+hotelName);
		System.out.println("Location :"+location);
		System.out.println("Capacity :"+capacity);
		System.out.println("RoomType :"+roomType);
		this.owner.printInfo();
	}

}
