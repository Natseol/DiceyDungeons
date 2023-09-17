package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class PoisonGas extends Item{

	public PoisonGas()	{
		name = "맹독";
		description = "[3]의 독 피해를 줍니다. 독+3";
		attack=3;
		poisonStack=3;
		count=9;
	}	
}