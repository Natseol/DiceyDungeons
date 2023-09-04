package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class FrontLine extends Item{

	public FrontLine()	{
		name = "선봉";
		description = "3의 피해를 입고, [3] 의 방어력을 얻습니다 주사위를 돌려받습니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		player.setDef(player.getDef()+3);
		printGainDefence(3);
		player.subtractHp(3);
		printDamage(3);
		changeDice = dice;
		my.setTurnTimes(idx, 0);
	}
}