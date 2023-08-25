package Item;

public class Wand extends Item{

	public Wand()	{
		this.name = "지팡이";
		this.count=8;
		printWand(this.count);
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (count>0) {
			count-=super.dice;					
		}
		else {
			super.enemyHp-=6;			
			damage(6);
			super.times=0;
			super.count=8;
			super.condition[0]++;//발화
		}
		super.dice=0;
	}	
}
//지팡이 : 6의 피해를 주고 발화효과부여(카운트8)