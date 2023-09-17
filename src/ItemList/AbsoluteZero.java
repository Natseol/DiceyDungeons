package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class AbsoluteZero extends Item{

	public AbsoluteZero()	{
		name = "절대영점";
		description = "[25] 의 냉기피해를 줍니다 빙결+3";
		attack=25;
		count=24;
		iceStack=3;
	}	
}