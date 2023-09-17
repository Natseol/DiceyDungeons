package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class SnowStorm extends Item{

	public SnowStorm()	{
		name = "눈폭풍";
		description = "[6] 의 냉기피해를 줍니다";
		attack=6;
		iceStack=1;
		count=8;
	}	
}