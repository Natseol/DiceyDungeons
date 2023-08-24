package Item;

public class Cannon extends Item{
	
	public Cannon()	{
		this.name = "캐논";
		this.count=15;
		printCount(this.count);
		this.times=1;		
	}	
	
	@Override
	public void action() {
		if (count>0) {
			count-=super.dice;					
		}
		else {
			super.enemyHp-=10;			
			damage(10);
			super.times=0;
			super.count=15;
		}
		super.dice=0;
	}
}
//캐논 : 적에게 10만큼의 피해를 준다 (카운트다운15)