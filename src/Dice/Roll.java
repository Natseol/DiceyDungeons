package Dice;

public class Roll {
	public static int rollDice (int dice) {
		dice = ((int)Math.random()*6)+1;
	return dice;
	}
}
