package Item;

public class Talisman extends Item{

	int otherDice = 0;
	
	public Talisman()	{
		this.name = "부적";
		this.count=10;
		this.description = "6 주사위를 2개 얻는다 (카운트 10) 현재 : "+count;
		this.times=1;		
	}	
	
	@Override
	public void action() {
		if (count>0) {
			count-=super.dice;					
		}
		else {
			super.dice=6;
			otherDice = 6;
			super.count=10;
		}
		super.times=0;
	}
}
//부적 : 6주사위 2개를 얻는다(카운트 10)
