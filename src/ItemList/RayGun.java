package ItemList;

import Battle.TurnInfo;
import Character.Status;
import Item.Item;

public class RayGun extends Item{

	public RayGun() {
		name = "레이건";
		description = "[3] 의 피해를 줍니다 (최소 3) (턴당 3번) ";
		times=2;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (dice<3) {
			printIncorrectDice();
			return;
		}
		enemy.subtractHp(3);
		printDamage(3);
		my.setTurnTimes(idx, my.getTurnTimes(idx)-1);
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice<3) {
			check=true;
		}
		return check;
	}
}
