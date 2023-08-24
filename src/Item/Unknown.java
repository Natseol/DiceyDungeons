package Item;

import Dice.Roll;

public class Unknown extends Item{
	
	public Unknown()	{
		this.name = "알수없음";
		this.description = "1~6만큼 피해를 줍니다";
		this.times=1;
	}	
	
	@Override
	public void action() {
		int damage=Roll.roll();
		super.enemyHp-=damage;
		damage(damage);
		super.times=0;
		super.dice=0;
	}	
}
//알수없음 : 1~6까지의 랜덤한 피해를 준다