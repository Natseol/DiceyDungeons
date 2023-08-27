package Battle;

import Item.Item;

public class TurnInfo {
	
	int diceQ;
	int[] dice;	
	Item[] turnItem;
	
	public int getDice(int diceIdx) {
		return dice[diceIdx];
	}
	
	public void setDice(int diceIdx,int changeNum) {
		dice[diceIdx]=changeNum;		
	}

}
