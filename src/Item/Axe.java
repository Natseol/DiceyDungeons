package Item;

public class Axe extends Item{

	public Axe()	{
		this.name = "도끼";
		this.description = "ㅁx2 만큼 피해를 줍니다 (최대 4)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice<=4) {
			super.enemyHp-=2*super.dice;
			damage(super.dice);
			damage(super.dice,1);
			super.times=0;
			super.dice=0;
		}
		else {
			checkDice();
		}
	}	
}
//도끼 : 눈금x2의 피해를 준다 (최대4의 눈금만 사용가능)
