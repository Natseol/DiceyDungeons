package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class Overwhelming extends Item{
		
	int accDamage;

	public Overwhelming()	{
		name = "제압";
		description = "[1~2]+("+accDamage+") 의 누적되는 피해를 줍니다.(턴당 2번)";
		times=2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		int damage=(int)(Math.random()*2)+1;
		accDamage+=damage;
		enemy.subtractHp(accDamage);
		printDamage(accDamage);
		description = "[1~2]+("+accDamage+") 의 누적되는 피해를 줍니다.(턴당 2번)";
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);	
	}
}