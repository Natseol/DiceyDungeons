package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Overwhelming extends Item{
		
	int accDamage;

	public Overwhelming()	{
		name = "제압";
		description = "[1~2] 의 피해를 줍니다. 사용할 때 마다 누적됩니다. 누적:"+accDamage;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		int damage=(int)(Math.random()*2)+1;
		accDamage+=damage;
		enemy.subtractHp(accDamage);
		printDamage(accDamage);
		description = "[1~2] 의 피해를 줍니다. 사용할 때 마다 누적됩니다. 누적:"+accDamage;
		times=0;
	}

	@Override
	public void action(Enemy enemy, Player player, int dice, EnemyTurn enemyTurn) {
		int damage=(int)(Math.random()*2)+1;
		accDamage+=damage;
		player.subtractHp(accDamage);
		printTakeDamage(accDamage);
		description = "[1~2] 의 피해를 줍니다. 사용할 때 마다 누적됩니다. 누적:"+accDamage;
		times=0;
	}
}