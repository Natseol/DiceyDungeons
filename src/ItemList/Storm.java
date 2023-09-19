package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Storm extends Item{

	public Storm()	{
		name = "폭풍";
		description = "[20] 의 전기피해를 줍니다 충격+3";
		attack=20;
		elecStack=3;
		count=22;
	}	
}