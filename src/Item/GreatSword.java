package Item;

public class GreatSword extends Item{

	public GreatSword()	{
		this.name = "대검";
		this.description = "ㅁx3 만큼 피해를 줍니다 (전투당 1번 사용가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		super.enemyHp-=super.dice;
		damage(super.dice);
		damage(super.dice,1);
		damage(super.dice,1,2);
		super.times=0;
		super.dice=0;
		//전투당 1번 사용가능
	}	
}
//대검 : 눈금x3의 피해를 준다 (전투당 1번만 사용가능)
//미완성
