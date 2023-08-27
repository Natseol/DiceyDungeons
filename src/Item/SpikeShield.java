package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class SpikeShield extends Item{
	
	public SpikeShield()	{
		name = "가시방패";
		description = "피해를 줍니다 (홀수)  방어력을 얻습니다 (짝수) (최대 5)";
		times=1;
	}
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (dice%2!=0) {
			enemy.subtractHp(dice);
			damage(dice);
			times=0;
		}
		else {
			player.setDef(player.getDef()+dice);
			gainDefence(dice);
			times=0;
		}		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>5) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//가시방패:  홀수일 때  눈금만큼 방어력을 얻는다. 짝수일 때 눈금만큼 피해를 준다(최대5의 눈금만 사용가능)

