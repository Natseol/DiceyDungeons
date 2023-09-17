package ItemList;

import Battle.TurnInfo;
import Character.*;
import Dice.Roll;
import Item.Item;

public class Crystal extends Item {

	public Crystal()	{
		name = "크리스탈";
		description="[1] 의 체력을 회복하고 새 주사위를 얻습니다";
		recovery = 1;
		newDice="7";
	}
}
