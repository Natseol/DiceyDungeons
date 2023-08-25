package Item;

public class Drop extends Item{

	public Drop()	{
		this.name = "하락";
		this.description = "주사위 눈금을 1올린다 (최소 2의 눈금)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		if (super.dice>=2) {
			this.times=0;
			super.dice--;
		}
		else {
			checkDice();
		}
	}
}
//하락 : 주사위눈금을 1하락시킨다(최소2의 눈금)
