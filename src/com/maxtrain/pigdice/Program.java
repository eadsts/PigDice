package com.maxtrain.pigdice;

public class Program {

	public static void main(String[] args) {
		//only running game one time
		System.out.println("started");
		var pigdice = new PigDice();
		var highscore = 200;
		var games = 1;
		var score = pigdice.Play();
		while (score <= highscore) {
			score = pigdice.Play();
			games++;
			System.out.println("*");
		}
		//Sysout + ctrl + spacebar
		var message = String.format("Game high score is %d after %d games.", score, games);
		//System.out.println("Game high score is " + score + " after " + games + " games.");
		System.out.println(message);
		System.out.println("end");
	}
	

}
