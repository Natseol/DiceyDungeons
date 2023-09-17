package ItemList;

import Battle.EnemyTurn;
import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;
import Item.ItemScript;

public class SpikeShield extends Item{
	
	public SpikeShield()	{
		name = "가시방패";
		description = "피해를 줍니다 (홀수)  방어력을 얻습니다 (짝수) (최대 5)";
		limit="1 2 3 4 5";
		attack=1;
		defence=1;
	}
	
	@Override
	public void actionAttack(Status player, Status enemy, int dice) {
		if (dice%2!=0) {
			enemy.subtractHp(dice);
			printDamage(dice);
		}
	}
	
	@Override
	public void actionDefence(Status player, int dice) {
		if (dice%2==0) {
			player.setDef(player.getDef()+dice);
			ItemScript.printGainDefence(dice);
		}	
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice%2!=0) {
//			enemy.subtractHp(dice);
//			printDamage(dice);
//			my.setTurnTimes(idx, 0);
//		}
//		else {
//			player.setDef(player.getDef()+dice);
//			printGainDefence(dice);
//			my.setTurnTimes(idx, 0);
//		}
//	}
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice>5) {
//			check=true;
//		}
//		return check;
//	}
}
//가시방패:  홀수일 때  눈금만큼 방어력을 얻는다. 짝수일 때 눈금만큼 피해를 준다(최대5의 눈금만 사용가능)

