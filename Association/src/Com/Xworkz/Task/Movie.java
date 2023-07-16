package Com.Xworkz.Task;

public class Movie {
	
	String title;
	String genre;
	String director;
	int duration;
	
	Director director1=new Director("S.S Rajamouli","FilmFare Award","Indian","October 10 1973");
	
	
	Movie()
	{
		System.out.println("Running no-args const in Movie...");
	}
	Movie(String title,String genre,String director,int duration)
	{
		System.out.println("Running String,String,String,int consts in Movie");
		this.title=title;
		this.genre=genre;
		this.director=director;
		this.duration=duration;
	}
	void printInfo()
	{
		System.out.println("Title :"+this.title);
		System.out.println("Genre :"+this.genre);
		System.out.println("Director :"+this.director);
		System.out.println("Duration :"+this.duration);
		this.director1.printInfo();
		
	}
}
