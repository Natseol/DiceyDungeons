package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Dice.Roll;

public class Reroll extends Item{

	public Reroll()	{
		name = "변경";
		times=3;
		description = "주사위를 다시 굴린다(한턴당 3번만 가능)";		
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		changeDice=Roll.roll6();
		times--;		
	}
}
//변경 : 주사위를 다시 굴린다(한턴당3번만 가능)(전사)