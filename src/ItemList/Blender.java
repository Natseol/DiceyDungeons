package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Blender extends Item{

	public Blender()	{
		name = "자르기";
		description = "1 눈금을 분리합니다 (최소 2)";
		limit="2 3 4 5 6";
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(dice-1);
		my.getDiceList().add(1);		
	}	
}
