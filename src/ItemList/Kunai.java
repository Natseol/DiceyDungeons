package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Kunai extends Item{

	public Kunai()	{
		name = "쿠나이";
		description = "ㅁx2 의 피해를 줍니다 (1만 가능) (재사용 가능)";
		times=-1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice>1) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice*2);
		printDamage(dice*2);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>1) {
			check=true;
		}
		return check;
	}	
}
