package ItemList;

import Battle.MyTurn;
import Battle.TurnInfo;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class IceShards extends Item{

	public IceShards()	{
		name = "얼음파편";		
		description="ㅁ 의 얼음 피해를 줍니다 (홀수)";
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice%2==0) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(dice);
		printDamageIce(dice);
		my.setTurnTimes(idx, 0);
		enemy.setCondition(1,enemy.getCondition(1)+1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice%2==0) {
			check=true;
		}
		return check;
	}
}
//얼음파편:눈금만큼 피해를 주고 냉기효과부여(홀수만 가능)