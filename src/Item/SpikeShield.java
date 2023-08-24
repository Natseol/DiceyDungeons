package Item;

public class SpikeShield extends Item{
	
	public SpikeShield()	{
		this.name = "가시방패";
		this.description = "(홀수) 피해를 줍니다  (짝수) 방어력을 얻습니다";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice%2!=0) {
			super.enemyHp-=super.dice;			
			damage(super.dice);
			super.times=0;
		}
		else {
			super.def+=super.def;
			gainDefence(super.dice);
			super.times=0;
		}
		super.dice=0;
	}
}
//가시방패:  홀수일 때  눈금만큼 방어력을 얻는다. 짝수일 때 눈금만큼 피해를 준다(최대5의 눈금만 사용가능)

