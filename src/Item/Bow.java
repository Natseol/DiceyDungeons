package Item;

import Battle.MyTurn;
import Character.*;

public class Bow extends Item{
	
	public Bow()	{
		name = "보우";
		count=10;
		description="6 피해를 줍니다 (카운트 10)";
		times=1;		
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count=count-dice;					
		}
		else {
			enemy.setHp(enemy.getHp()-6);
			damage(10);
			times=0;
			count=10;
		}
	}
}
//보우 : 적에게 6만큼의 피해를 준다 (카운트다운10)