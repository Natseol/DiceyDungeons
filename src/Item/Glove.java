package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Glove extends Item{

	public Glove()	{
		name = "글러브";
		printGlove();
		times=1;
	}	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		damage(dice);
		times=0;
//		condition[2]++;//차후구현
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<2||dice>5) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//글러브:눈금만큼 피해를 주고 마비효과부여(2~5의눈금)
