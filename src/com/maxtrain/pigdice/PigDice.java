package com.maxtrain.pigdice;

public class PigDice {
	//Play returns the score as an int for one game; use an instance method
	public int Play() {
		var score = 0;
		var roll = Roll();
		while (roll != 1) {
			score += roll;
			roll = Roll();
			//test this using a for loop
			//for (var idx = 0; idx < 10; idx++) {
			//System.out.println("The role is " + Roll());
			//}
			//return 0;
		}
		return score;
	}
	private int Roll() {
		//math.random returns a double number between 0 - 1; but we want whole numbers
		//we only want integers so we multiply by 10 and add (int)
		//then we only want numbers 0-5 so we do modulo 6 which is one higher than 5
		//then we need to add 1 because we only want the numbers 1-6 on the dice
		return (int)(Math.random() * 10) % 6 + 1;
}
}
