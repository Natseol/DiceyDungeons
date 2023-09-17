package Battle;

import java.util.LinkedList;
import java.util.List;

import Character.Status;
import Dice.Roll;

public class TurnDice {
	
	List<Integer> diceList = new LinkedList<>();
	
 	public void resetDiceList(Status status) {
 		diceList.clear();
 		for (int i = 0 ; i<status.getDiceQuantity();i++) {
 			diceList.add(Roll.roll6());
 		}
 	}
	
 	public List<Integer> getDiceList() {
 		return diceList;
 	}
 	
	public int getDiceList(int diceIdx) {
		return diceList.get(diceIdx);
	}

}
