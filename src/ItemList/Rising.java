package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Rising extends Item{

	public Rising()	{
		name = "상승";
		description = "주사위 눈금을 1 올립니다 (최대 5 이하)";
		times=1;
	}
	
	@Override
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		changeDice=dice+1;
		times=0;		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>5) {
			check=true;
		}
		return check;
	}
}
//상승 : 주사위 눈금을 1올린다(최대5의 눈금)
