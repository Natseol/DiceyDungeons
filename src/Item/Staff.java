package Item;

public class Staff extends Item{

	public Staff()	{
		this.name = "스태프";
		this.description = "ㅁ 만큼 피해를 줍니다 (짝수) (눈금이 4일경우 주사위를 돌려받습니다)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice%2==0) {
			super.enemyHp-=super.dice;			
			damage(super.dice);
			super.times=0;
			super.dice=4;
		}
		else {
			checkDice();
		}
	}
}
//스태프 : 눈금만큼의 피해를 준다(눈금이 4일경우 주사위를 돌려받는다)(짝수주사위만 사용가능)
