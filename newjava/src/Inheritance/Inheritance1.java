package Inheritance;
import java.util.Scanner;

public class Inheritance1 {

	public static void main(String[] args) {
		player p=new player();
		
		
	}

}

class player
{

		String playerName;
		int age;
		int manOfTheMatch;
		int bestScore;
		String country;
		String team;
		int goals;
	
}

class cricket extends player{
	
	
	public cricket(String playerName,int age,int manOfTheMatch ) {
		this.playerName=playerName;
		this.age=age;
		this. manOfTheMatch=manOfTheMatch;
		
		
		
		
	}
	
	public String getplayerName() {
		return playerName;
		}
	
	public int getage() {
		return age;
		
	}
	
}
