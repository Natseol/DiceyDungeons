package Item;

public class Fist extends Item{

	public Fist() {
		this.name = "주먹";
		this.description = "2만큼 피해를 줍니다 (재사용 가능)";
		this.times=1;
	}	
	
	@Override
	public void action() {
		super.enemyHp-=2;
		damage(2);
		super.dice=0;
	}
}
//주먹 : 2의 피해를 준다 (재사용가능)