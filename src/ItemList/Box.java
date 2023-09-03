package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Box extends Item{
	
	public Box()	{
		name = "상자";
		description = "[?] 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		int damage = Roll.roll6();
		enemy.subtractHp(damage);
		printDamage(damage);
		my.setTurnTimes(idx, 0);
	}
}
//알수없음 : 1~6까지의 랜덤한 피해를 준다