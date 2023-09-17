package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class ShortSword extends Item{

	public ShortSword() {
		name = "짧은 검";
		description = "[2] 의 피해를 줍니다 (턴당 3번)";
		attack=2;
		times=3;
	}	
}