package ItemList;

import Battle.*;
import Character.*;
import Item.Item;

public class ForceField extends Item{
		
	int accDef;

	public ForceField()	{
		name = "역장";
		description = "[1]+("+accDef+") 의 누적되는 방어력을 얻습니다.";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		player.setDef(player.getDef()+1+accDef);
		printGainDefence(1+accDef);
		accDef++;
		description = "[1]+("+accDef+") 의 누적되는 방어력을 얻습니다.";
		my.setTurnTimes(idx, 0);	
	}
}