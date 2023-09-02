package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class HolySword extends Item{

	public HolySword()	{
		name = "성검";
		description="ㅁ 의 피해를 줍고, 체력을 [1] 회복합니다 (3~4 만 가능)";
		times=1;
	}	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>4||dice<3) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice);
		printDamage(dice);
		player.addHp(1);
		printRecovery(1);
		my.setTurnTimes(idx, 0);		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<3||dice>4) {
			check=true;
		}
		return check;
	}
}