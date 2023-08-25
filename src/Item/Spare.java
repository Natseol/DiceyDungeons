package Item;

public class Spare extends Item{

	public Spare()	{
		this.name = "예비";
		this.description = "눈금 4 주사위를 획득한다";
		this.times=1;
	}	
	
	@Override
	public void action() {
		super.times=0;
		super.dice=4;
	}
}
//예비 : 눈금4 주사위를 획득한다