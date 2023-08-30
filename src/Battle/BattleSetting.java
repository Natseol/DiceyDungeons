package Battle;

public class BattleSetting {
	
	int[][] itemState=new int[3][6];//0:카운트 1:대검 2:추가할 것
	int addDice;
//	int[] condition=new int[3];
	
	public int getCount(int idx) {
		return itemState[0][idx];
	}
	public void setCount(int idx, int num) {
		itemState[0][idx]=num;
	}
	
	public int getAddDice() {
		return addDice;
	}
	public void setAddDice(int num) {
		addDice=num;
	}
	
//	public int getCondition(int num) {
//		return condition[num];
//	}
//	public void setCondition(int idx, int num) {
//		condition[idx]=num;
//	}

}
