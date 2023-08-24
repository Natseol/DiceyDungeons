package Item;

public class Dagger extends Item{

	public Dagger()	{
		this.name = "단검";
		this.description = "ㅁ 만큼 피해를 줍니다 (최대 3) (재사용 가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice<=3) {
			super.enemyHp-=super.dice;
			damage(super.dice);
			super.dice=0;
		}
		else {
			checkDice();
		}
	}
}
//단검 : 눈금만큼 피해를 준다 (최대3의 눈금만 사용가능) (재사용가능)
