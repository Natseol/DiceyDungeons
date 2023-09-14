package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class FireBall extends Item{

	public FireBall()	{
		name = "화염구";		
		description="ㅁ 의 화염 피해를 줍니다 (짝수)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2!=0) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice);
		printDamageFire(dice);
		my.setTurnTimes(idx, 0);
		enemy.setCondition(0,enemy.getCondition(0)+1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2!=0) {
			check=true;
		}
		return check;
	}
}