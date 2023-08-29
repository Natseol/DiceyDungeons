package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class Heal extends Item{

	public Heal()	{
		name = "치유";
		description="ㅁ 의 체력을 회복합니다 (최대 3 이하)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		player.addHp(dice);
		printRecovery(dice);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>3) {
			check=true;
		}
		return check;
	}
}
//치유 : 눈금만큼체력을 회복한다 (최대 눈금3)