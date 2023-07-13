package com.Xworkz.Work;

public class Game {
	String name;
	GameVenue venue;
	int score=100;
	int totalPlayers;
	
	Game(String name)
	{
		this.name=name;
	}
	void setTotalPlayers(int totalPlayers)
	{
		this.totalPlayers=totalPlayers;
	}
	void display()
	{
		System.out.println("Display...");
		System.out.println(name);
		System.out.println(venue);
		System.out.println(score);
		System.out.println(totalPlayers);
	}

}
