package Item;

public class lockPick extends Item{
	
	int otherDice = 0;
	
	public lockPick()	{
		this.name = "락픽";
		this.description = "주사위를 둘로 나눈다 (재사용 1회 가능)";
		this.times=2;
	}
	
	@Override
	public void action() {
		this.times--;		
		switch (super.dice) {
		case 6:
			super.dice = 3;
			otherDice = 3;
			break;
		case 5:
			super.dice = 3;
			otherDice = 2;
			break;
		case 4:
			super.dice = 2;
			otherDice = 2;
			break;
		case 3:
			super.dice = 2;
			otherDice = 1;
			break;
		case 2:
			super.dice = 1;
			otherDice = 1;
			break;
		case 1:
			checkDice();
			this.times++;
			break;			
		}
		if (times==1) {
			this.description = "주사위를 둘로 나눈다";
		}
		else {
			this.description = "주사위를 둘로 나눈다 (재사용 1회 가능)";
		}
	}
}
//락픽 : 주사위를 둘로 나눈다(재사용1회 가능)
