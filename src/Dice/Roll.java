package Dice;

public class Roll {
	public static int roll6() {
		return (int)(Math.random()*6)+1;
	}
	
	public static int random(int num) {
		return (int)(Math.random()*num)+1;
	}
}
