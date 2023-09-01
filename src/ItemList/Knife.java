package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Knife extends Item{

	public Knife()	{
		name = "맹독";
		description = "독을 바른 칼을 던집니다. 독+3 (카운트 10)";
		count=10;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (count-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			printTakePoison(3);
			enemy.setCondition(3,enemy.getCondition(0)+3);
			my.setTurnTimes(idx, 0);
			my.setTurnCount(idx, 10);
		}
	}
}//미구현