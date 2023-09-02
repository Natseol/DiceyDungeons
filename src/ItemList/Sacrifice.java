package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Sacrifice extends Item{

	public Sacrifice()	{
		name = "희생";
		times=1;
		description = "[3]의 피해를 입고, 주사위를 생성합니다";		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		player.subtractHp(3);
		printTakedDamage(3);
		my.setOther(1);
		my.setOther(0,Roll.roll6());
		changeDice=dice;				
		my.setTurnTimes(idx, 0);		
	}
}