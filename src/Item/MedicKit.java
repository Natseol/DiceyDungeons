package Item;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;

public class MedicKit extends Item{
	
	public MedicKit()	{
		name = "구급상자";
		count=16;
		recoveryM(8,count);
		times=1;		
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		if (count-dice>0) {
			count-=dice;					
		}
		else {
			player.setHp(player.getHp()+8);
			if (player.getHp()>player.getMaxHp()) {				
				player.setHp(player.getMaxHp());
			}
			recovery(8);
			count=16;
		}
	}
}
//구급상자 : 8만큼 체력을 회복한다 (카운트16)
