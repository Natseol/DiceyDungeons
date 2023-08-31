package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Unknown extends Item{
	
	public Unknown()	{
		name = "상자";
		description = "(알 수 없음) 피해를 줍니다";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		int damage = Roll.roll6();
		enemy.subtractHp(damage);
		printDamage(damage);
		times=0;
	}
}
//알수없음 : 1~6까지의 랜덤한 피해를 준다