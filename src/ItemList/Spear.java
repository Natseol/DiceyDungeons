package ItemList;

import Battle.EnemyTurn;
import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Spear extends Item{

	public Spear()	{
		name = "창";
		description = "[10] 의 피해를 줍니다 (6 만 사용 가능)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice<6) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(10);
		printDamage(10);
		my.setTurnTimes(idx, 0);
	}
	
//	@Override
//	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
//		if (dice == 6) {
//		player.subtractHp(10);
//		printTakeDamage(10);
//		times=0;
//		}
//	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<6) {
			check=true;
		}
		return check;
	}
}
//창 :  10만큼의 피해를 준다(6의 눈금만 사용가능)
