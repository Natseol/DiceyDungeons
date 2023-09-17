package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Clone extends Item{
	
	public Clone()	{
		name = "위조";
		description = "주사위를 복제합니다 (최대 5)";
		limit="1 2 3 4 5";
		newDice=" ";
	}
	
	@Override
	public void actionNewDice(TurnInfo my, int dice) {//음수면 dice값으로 계산
		my.getDiceList().add(dice);
		my.getDiceList().add(dice);
	}	
//	
//	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice>5) {
//			printIncorrectDice();
//			return;
//		}
//		my.setOther(1);
//		my.setOther(0,dice);
//		my.setTurnTimes(idx, 0);		
//	}
//	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice>5) {
//			check=true;
//		}
//		return check;
//	}
}
//위조 : 주사위를 복제한다(도적)