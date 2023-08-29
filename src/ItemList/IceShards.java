package ItemList;

import Battle.MyTurn;
import Character.Enemy;
import Character.Player;
import Item.Item;

public class IceShards extends Item{

	public IceShards()	{
		name = "얼음파편";		
		description="ㅁ 의 얼음 피해를 줍니다 (홀수만 가능)";
		times=1;
	}	
	
	@Override
	public void action(Player player, Enemy enemy, int dice, MyTurn my) {
		enemy.subtractHp(dice);
		printDamage(dice);
		times=0;
		enemy.setCondition(1,enemy.getCondition(1)+1);//차후구현
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