package Item;

import Character.*;

public class Axe extends Item{

	public Axe()	{
		name = "도끼";
		description = "ㅁx2 만큼 피해를 줍니다 (최대 4)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice) {
		enemy.setHp(enemy.getHp()-2*dice);
		damage(dice);
		damage(dice,1);
		times=0;
	}
	
	@Override
	public boolean checkDice(int dice) {
		if (dice>4) {
			checkPrint();
			check=true;
		}
		return check;
	}
}
//도끼 : 눈금x2의 피해를 준다 (최대4의 눈금만 사용가능)
