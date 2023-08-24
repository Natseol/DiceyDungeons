package Item;

public class Glove extends Item{

	public Glove()	{
		this.name = "글러브";
		printGlove();
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
//글러브:눈금만큼 피해를 주고 마비효과부여(2~5의눈금)
