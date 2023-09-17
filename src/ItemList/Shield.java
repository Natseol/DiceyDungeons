package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Shield extends Item{

	public Shield()	{
		name = "방패";
		description = "ㅁ 의 방어력을 얻습니다 (최대 2) (재사용 가능)";
		limit="1 2";
		defence=-1;
		times=-1;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice>2) {
//			printIncorrectDice();
//			return;
//		}
//		player.setDef(player.getDef()+dice);
//		printGainDefence(dice);
//	}
//	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice>2) {
//			check=true;
//		}
//		return check;
//	}	
}
