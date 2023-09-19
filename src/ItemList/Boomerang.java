package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Boomerang extends Item{

	public Boomerang()	{
		name = "부메랑";
		description = "ㅁx2 의 피해를 주고 4 의 피해를 받습니다";
		attack = -2;
		damage = 4;
	}	
}
