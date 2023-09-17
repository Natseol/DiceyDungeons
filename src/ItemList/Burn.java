package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class Burn extends Item{

	public Burn()	{
		name = "태우기";		
		description="적을 불태웁니다. 발화+2 (짝수) (재사용가능)";
		limit="2 4 6";
		times=-1;
		fireStack=2;
	}	
	
//	@Override
//	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
//		if (dice%2!=0) {
//			printIncorrectDice();
//			return;
//		}
//		printFire(2);
//		enemy.setCondition(0,enemy.getCondition(0)+2);
//	}
//	
//	@Override
//	public boolean checkDice(int dice) {
//		if (dice%2!=0) {
//			check=true;
//		}
//		return check;
//	}
}
