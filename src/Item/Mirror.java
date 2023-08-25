package Item;

public class Mirror extends Item{

	public Mirror()	{
		this.name = "거울";
		this.description = "이 전투에서 주사위 갯수 +1 (눈금 6만 가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice==6) {					
			super.times=0;
			super.dice=0;
			super.diceQuantity++;
		}
		else {
			checkDice();
		}
	}
}
//거울 : 이 전투에서 주사위 갯수 +1 (눈금6만 가능)
