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
		description = "주사위를 다시 굴립니다 (턴당 2번)";		
		times=2;
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(Roll.roll6());
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		my.getDiceList().add(Roll.roll6());
////		changeDice=Roll.roll6();
//		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);		
//	}
}
//변경 : 주사위를 다시 굴린다(한턴당3번만 가능)(전사)