package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Burn extends Item{

	public Burn()	{
		name = "태우기";		
		description="적을 불태웁니다. 발화+2 (짝수) (재사용가능)";
		limit="-2";
		times=-1;
		fireStack=2;
	}	
}
