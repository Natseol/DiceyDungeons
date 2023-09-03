package ItemList;

import Battle.EnemyTurn;
import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Revolver extends Item{

	public Revolver()	{
		name = "리볼버";
		description = "[6] 의 피해를 줍니다 (6만 가능) (턴당 3번)";
		times=3;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice<6) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(6);
		printDamage(6);
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);	
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<6) {
			check=true;
		}
		return check;
	}
}