package Item;

public class Clone extends Item{

int otherDice = 0;
	
	public Clone()	{
		this.name = "위조";
		this.description = "주사위를 복제한다";
		this.times=1;
	}
	
	@Override
	public void action() {
		this.times--;		
		otherDice = super.dice;
	}
}
//위조 : 주사위를 복제한다(도적)