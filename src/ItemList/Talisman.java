package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Talisman extends Item{
	
	public Talisman()	{
		name = "부적";
		count=7;
		description = "3 주사위를 2개 얻습니다";
		times=1;
		newDiceLength=2;
		newDice = new int[newDiceLength];
		newDice[0] = 3;
		newDice[1] = 3;
	}	

	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);					
		}
		else {
			for (int i = 0 ; i < newDice.length ; i ++) {
				my.getDiceList().add(newDice[i]);
			}
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 7);
		}
	}
}