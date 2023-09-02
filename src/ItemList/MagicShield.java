package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class MagicShield extends Item{

	public MagicShield()	{
		name = "매직쉴드";
		description = "[4] 의 방어력을 얻고, [2] 의 체력을 회복합니다 (카운트 8)";
		count=8;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)-dice>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-dice);
			my.setTurnTimes(idx, 1);
		}
		else {
			player.setDef(player.getDef()+4);
			printGainDefence(4);
			player.addHp(2);
			printRecovery(2);
			my.setTurnCount(idx, 8);
			my.setTurnTimes(idx, 0);
		}
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			check=true;
		}
		return check;
	}	
}