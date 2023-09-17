package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Bow extends Item{
	
	public Bow()	{
		name = "활";
		description="[7] 의 피해를 줍니다";
		attack=7;
		count=9;
	}	
}
