package Item;

public class Rising extends Item{

	public Rising()	{
		this.name = "상승";
		this.description = "주사위 눈금을 1올린다 (최대 5의 눈금)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice<=5) {
			this.times=0;
			super.dice++;
		}
		else {
			checkDice();
		}
	}
}
//상승 : 주사위 눈금을 1올린다(최대5의 눈금)
