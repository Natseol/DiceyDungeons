package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class PoisonCloud extends Item{

	public PoisonCloud()	{
		name = "독구름";		
		description="독을 겁니다 독+2 (짝수)";
		limit="-2";
		poisonStack=2;
	}	
}
