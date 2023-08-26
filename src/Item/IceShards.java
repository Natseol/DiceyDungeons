package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class IceShards extends Item{

	public IceShards()	{
		name = "얼음파편";
		printShard();
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.setHp(enemy.getHp()-dice);
		damage(dice);
		times=0;
//		condition[1]++;//차후구현
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//얼음파편:눈금만큼 피해를 주고 냉기효과부여(홀수만 가능)