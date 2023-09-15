package Item;

public class Sword implements IItem, IDamage {
	private int damage;

	public String getName() {return "";}
//	public String getDamage() {return damage;}
	public String getDescription() {return "";}
	
	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public int getDamage() {return damage;}

	@Override
	public void actionDamage() {
		damage=damage-2;
	};
	
	
}
