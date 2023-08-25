package Character;

public class Status {
	protected int hp = 30;
	protected int maxHp = 30;
	protected int def;
	protected int selectDice;
	protected int diceQuantity;
	
	public int getDiceQuantity() {
		return diceQuantity;
	}
	
	public void setSelectDice(int dice) {
		selectDice = dice;
	}
	
}
