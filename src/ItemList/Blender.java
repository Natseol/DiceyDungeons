package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Blender extends Item{

	public Blender()	{
		name = "자르기";
		description = "1 눈금을 분리합니다 (최소 2)";
		limit="2 3 4 5 6";
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {
		my.getDiceList().add(dice-1);
		my.getDiceList().add(1);		
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice<2) {
//			printIncorrectDice();
//			return;
//		}
//		my.setOther(1);
//		my.setOther(0,1);
//		my.setTurnTimes(idx, 0);
//		
//	}
//	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice<2) {
//			check=true;
//		}
//		return check;
//	}
}
//하락 : 주사위눈금을 1하락시킨다(최소2의 눈금)
