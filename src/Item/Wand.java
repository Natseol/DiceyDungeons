package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class Wand extends Item{

	public Wand()	{
		name = "지팡이";
		count=8;
		printWand(count);
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count-=dice;
			times=1;
		}
		else {
			enemy.subtractHp(6);		
			damage(6);
//			condition[0]++;//차후구현
			times=0;
			count=8;
		}
	}	
}
//지팡이 : 6의 피해를 주고 발화효과부여(카운트8)