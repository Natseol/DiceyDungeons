package Battle;

import Character.*;
import Dice.Roll;

public class Round {
	Player plr = new Player();	
	
	public int[] rollADice() {
		int dice[]=new int[plr.getDiceQuantity()];
		for (int i = 0; i < dice.length; i++) {
			dice[i]=Roll.roll6();			
		}
		return dice;
	}
	
	public int selectDice(int[] dice, int idx) {
		return dice[idx];	 
	}
}
