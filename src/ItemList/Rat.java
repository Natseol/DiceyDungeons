package ItemList;

import Battle.*;
import Character.*;
import Dice.Roll;
import Item.Item;

public class Rat extends Item{

	public Rat()	{
		name = "쥐";
		description = "독+1, 새 주사위를 가집니다";
		count=5;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			enemy.setCondition(0,enemy.getCondition(0)+1);
			printPoisoned(1);
			changeDice=Roll.roll6();
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 5);
		}
	}
}