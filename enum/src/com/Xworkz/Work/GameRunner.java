package com.Xworkz.Work;

public class GameRunner {
	public static void main(String[] args)
	{
		Game game=new Game("Cricket");
		game.setTotalPlayers(11);
		game.venue=GameVenue.CHINNASWAMY;
		game.display();
		Game game1=new Game("Cricket");
		game1.setTotalPlayers(11);
		game1.venue=GameVenue.SYDNEY;
		game1.display();
	}

}
