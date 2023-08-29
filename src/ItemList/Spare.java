package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class Spare extends Item{

	public Spare()	{
		name = "예비";
		description = "눈금 4 주사위를 획득한다";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		changeDice=4;
		times=0;		
	}
}

//예비 : 눈금4 주사위를 획득한다