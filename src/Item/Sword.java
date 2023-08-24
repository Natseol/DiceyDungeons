package Item;

public class Sword extends Item{

	public Sword()	{
		this.name = "검";
		this.description = "ㅁ 만큼 피해를 줍니다";
		this.times=1;
	}	
	
	@Override
	public void action() {
		super.enemyHp-=super.dice;
		damage(super.dice);
		super.times=0;
		super.dice=0;
	}	
}
//검 : 눈금만큼 피해를 준다
