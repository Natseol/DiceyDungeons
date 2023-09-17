package Item;

import java.util.ArrayList;
import java.util.List;

public class Limit extends Count {
	protected String limit;
	
	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	public String getLmit() {return limit;}

	boolean actionLimit(int dice) {//0이면 true, 숫자 포함되어있으면 true
		if (Integer.parseInt(limit)==0 ) return true;
		
		char[] limitChar = limit.toCharArray();
		List<Integer> limitList = new ArrayList<>();
		for (char c : limitChar) {
			limitList.add((int)c);			
		}		
		return limitList.contains(dice);		
	};
}
