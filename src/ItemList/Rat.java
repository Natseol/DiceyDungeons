package ItemList;

import Battle.*;
import Character.*;
import Dice.Roll;
import Item.Item;

public class Rat extends Item{

	public Rat()	{
		name = "쥐";
		description = "독+1, 새 주사위를 가집니다";
		poisonStack=1;
		newDice="7";
		count=5;
	}
}