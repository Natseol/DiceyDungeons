package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Kunai extends Item{

	public Kunai()	{
		name = "쿠나이";
		description = "ㅁx2 의 피해를 줍니다 (1만 가능) (재사용 가능)";
		limit="1";
		attack=-2;
		times=-1;
	}
}
