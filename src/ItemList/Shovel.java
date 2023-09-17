package ItemList;

import Battle.*;
import Character.*;
import Item.Item;
import Item.ItemScript;

public class Shovel extends Item{

	public Shovel()	{
		name = "삽";
		description = "ㅁ 의 피해를 줍니다. (6: 전기피해를 줍니다)";
		attack=-1;
		activeLimit="6";
		elecStack=1;
	}
}
