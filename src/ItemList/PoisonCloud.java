package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class PoisonCloud extends Item{

	public PoisonCloud()	{
		name = "독구름";		
		description="독을 겁니다 독+2 (짝수)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2!=0) {
			printIncorrectDice();
			return;
		}
		printPoisoned(2);
		enemy.setCondition(3,enemy.getCondition(3)+2);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2!=0) {
			check=true;
		}
		return check;
	}
}
