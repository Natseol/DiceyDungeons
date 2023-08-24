package Item;

public class Saw extends Item{
	int otherDice = 0;
	int anotherDice = 0;
	
	public Saw() {
		this.name = "쇠톱";
		this.description = "주사위를 셋으로 나눈다";
		this.times=1;
	}
	
	@Override
	public void action() {
		this.times--;		
		switch (super.dice) {
		case 6:
			super.dice = 2;
			otherDice = 2;
			anotherDice = 2;
			break;
		case 5:
			super.dice = 2;
			otherDice = 2;
			anotherDice = 1;
			break;
		case 4:
			super.dice = 2;
			otherDice = 1;
			anotherDice = 1;
			break;
		case 3:
			super.dice = 1;
			otherDice = 1;
			anotherDice = 1;
			break;
		default :
			checkDice();
			this.times++;
			break;			
		}
	}	
}
//쇠톱 : 주사위를 셋으로 나눈다
