package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Character.Status;
import Item.Item;

public class Drop extends Item{

	public Drop()	{
		name = "하락";
		description = "주사위 눈금을 1 내립니다 (최소 2 이상)";
		times=1;
	}	
	
	public void action(Status player, Status enemy, int dice, MyTurn my) {
		changeDice=dice-1;
		times=0;		
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<2) {
			check=true;
		}
		return check;
	}
}
//하락 : 주사위눈금을 1하락시킨다(최소2의 눈금)
