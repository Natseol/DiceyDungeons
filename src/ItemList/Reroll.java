package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Dice.Roll;
import Item.Item;

public class Reroll extends Item{

	public Reroll()	{
		name = "변경";
		times=3;
		description = "주사위를 다시 굴립니다 (한 턴당 3번)";		
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		changeDice=Roll.roll6();
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);		
	}
}
//변경 : 주사위를 다시 굴린다(한턴당3번만 가능)(전사)