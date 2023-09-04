package ItemList;

import Battle.EnemyTurn;
import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Katana extends Item{

	public Katana()	{
		name = "카타나";
		description = "ㅁ 의 피해를 줍니다 (최대 4) (턴당 2번)";
		times=2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>4) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice);
		printDamage(dice);
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>4) {
			check=true;
		}
		return check;
	}
}