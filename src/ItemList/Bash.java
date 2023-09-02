package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Bash extends Item{

	public Bash()	{
		name = "강타";
		description = "ㅁ 의 피해를 줍니다 [1]의 방어력을 얻습니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		enemy.subtractHp(dice);
		printDamage(dice);
		player.setDef(player.getDef()+1);
		printGainDefence(1);
		my.setTurnTimes(idx, 0);
	}
}