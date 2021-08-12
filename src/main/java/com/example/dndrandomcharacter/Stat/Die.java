package com.example.dndrandomcharacter.Stat;

public class Die {
	int sides;
	// generates a die object using the number of sides from the constructor
	public Die(int sides){
		this.sides = sides;
	}
	//rolls the die
	public int roll() {
		int result = (int) (Math.random()*sides) + 1;
		return result;
	}
}
