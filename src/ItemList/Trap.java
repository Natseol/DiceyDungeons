package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Trap extends Item{

	public Trap()	{
		name = "함정";
		description = "[1] 의 전기 피해를 줍니다 독+2";
		attack=1;
		elecStack=1;
		poisonStack=2;
		count=7;
	}	
}