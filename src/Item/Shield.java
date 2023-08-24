package Item;

public class Shield extends Item{

	public Shield()	{
		this.name = "방패";
		this.description = "3의 방어력을 얻는다 (홀수만 가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice%2==0) {
			checkDice();
		}			
		else {
			super.def+=super.def;			
			gainDefence(super.dice);
			super.times=0;
			super.dice=0;
		}
	}
}
