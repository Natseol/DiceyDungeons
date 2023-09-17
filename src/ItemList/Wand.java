package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Wand extends Item{

	public Wand()	{
		name = "완드";
		description="[6] 의 화염 피해를 줍니다";
		attack=6;
		fireStack=1;
		count=8;
	}	
}
