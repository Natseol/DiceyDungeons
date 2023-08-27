package Item;

import Battle.MyTurn;
import Character.*;

public class Cannon extends Item{
	
	public Cannon()	{
		name = "캐논";
		count=15;
		printCount(count);
		times=1;		
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count=count-dice;
			times=1;
		}
		else {
			enemy.subtractHp(10);
			damage(10);
			times=0;
			count=15;
		}
	}
}
//캐논 : 적에게 10만큼의 피해를 준다 (카운트다운15)