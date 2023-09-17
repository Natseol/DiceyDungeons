package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Rising extends Item{

	public Rising()	{
		name = "상승";
		description = "주사위 눈금을 1 올립니다";
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		if (dice == 6) {
			my.getDiceList().add(6);
			my.getDiceList().add(1);			
		} else {
		my.getDiceList().add(dice+1);
		}
	}	
}
