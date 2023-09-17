package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.*;
import Item.Item;

public class Bandage extends Item {

	public Bandage()	{
		name = "붕대";
		description="[2] 의 체력을 회복합니다 (재사용 가능)";
		recovery=2;
		times=-1;		
	}	
}
