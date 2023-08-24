package Item;

public class IceShards extends Item{

	public IceShards()	{
		this.name = "얼음파편";
		printShard();
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice>=2&&super.dice<=5) {
			super.enemyHp-=super.dice;			
			damage(super.dice);
			super.times=0;
			super.effect[2]++;//마비
			super.dice=0;
		}
		else {
			checkDice();
		}
	}
}
//얼음파편:눈금만큼 피해를 주고 냉기효과부여(홀수만 가능)