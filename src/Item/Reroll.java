package Item;

import Dice.Roll;

public class Reroll extends Item{

	public Reroll()	{
		this.name = "변경";
		this.times=3;
		this.description = "주사위를 다시 굴린다(한턴당 3번만 가능) 현재 : "+this.times;		
	}	
	
	@Override
	public void action() {
		this.description = "주사위를 다시 굴린다(한턴당 3번만 가능) 현재 : "+this.times;
		super.times--;
		super.dice=Roll.roll6();
	}
}
//변경 : 주사위를 다시 굴린다(한턴당3번만 가능)(전사)