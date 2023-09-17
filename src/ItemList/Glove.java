package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Glove extends Item{

	public Glove()	{
		name = "글러브";
		description="ㅁ 의 전기 피해를 줍니다 (2~4 만 가능)";
		limit="2 3 4";
		attack=-1;
		elecStack=1;
	}	
}
