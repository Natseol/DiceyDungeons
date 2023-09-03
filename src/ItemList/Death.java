package ItemList;

import Battle.*;
import Character.*;
import Item.Item;
import Main.Color;

public class Death extends Item{

	int phase;
	
	public Death()	{
		name = "종말";
		description = "끝이 오고 있습니다";
		count=10;
		times=1;
	}	
	
	@Override
	public void action(Status player, Status enemy, int dice, TurnInfo my, int idx) {
		if (my.getTurnCount(idx)>0) {
			my.setTurnCount(idx, my.getTurnCount(idx)-1);
			System.out.println(Color.BBLACK+"더욱 더 어두워집니다"+Color.RESET);
			my.setTurnTimes(idx, 0);
		}
		else {
			printDamage(99);
			enemy.subtractHp(99);
			my.setTurnTimes(idx, 1);
		}
		if (phase==0&&player.getHp()<20) {
			phase++;
			player.addHp(14);
			System.out.println("\n\n   몸을 웅크립니다");
			System.out.println(" "+Color.B_BGREEN+" 18 "+Color.RESET+" 의 체력을 회복했습니다");
		}
	}
}