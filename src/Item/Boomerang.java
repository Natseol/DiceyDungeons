package Item;

public class Boomerang extends Item{

	public Boomerang()	{
		this.name = "부메랑";
		this.description = "ㅁx2 만큼 피해를 주고 ㅁ만큼 피해를 받습니다";
		this.times=1;
	}	
	
	@Override
	public void action() {
		super.enemyHp-=2*super.dice;
		System.out.println(super.dice+"만큼 피해를 줬습니다!");
		damage(super.dice);
		super.times=0;
		System.out.println();
		super.hp-=super.dice;
		takeDamage(super.dice);
		super.dice=0;
	}	
}
//부메랑 : 눈금의 2배만큼 피해를 준다. 주사위 눈금만큼 피해를 받는다.