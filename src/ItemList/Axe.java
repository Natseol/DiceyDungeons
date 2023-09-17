package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Axe extends Item{

	public Axe()	{
		name = "도끼";
		description = "ㅁx2 의 피해를 줍니다 (최대 4)";
		limit="1 2 3 4";
		attack=-2;
	}	
}
