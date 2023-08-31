package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Glove extends Item{

	public Glove()	{
		name = "글러브";
		description="ㅁ 의 마비 피해를 줍니다 (2~5 만 가능)";
		times=1;
	}	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
		times=0;
		enemy.setCondition(2,enemy.getCondition(2)+1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<2||dice>5) {
			check=true;
		}
		return check;
	}
}
//글러브:눈금만큼 피해를 주고 마비효과부여(2~5의눈금)
