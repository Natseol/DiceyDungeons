package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Wand extends Item{

	public Wand()	{
		name = "지팡이";
		count=8;
		description="[6] 의 화염 피해를 줍니다 (카운트 8)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count-=dice;
			times=1;
		}
		else {
			enemy.subtractHp(6);		
			printDamage(6);
			enemy.setCondition(0,enemy.getCondition(0)+1);//차후구현
			times=0;
			count=8;
		}
	}
}
//지팡이 : 6의 피해를 주고 발화효과부여(카운트8)