package Item;

import java.util.ArrayList;
import java.util.List;

public interface ILimit {
	public void setLimit(String limit);
	public String getLmit();

	default boolean actionLimit(int dice) {//0이면 true, 숫자 포함되어있으면 true
		if (Integer.parseInt(getLmit())==0 ) return true;		
		char[] limitChar = getLmit().toCharArray();
		List<Integer> limitList = new ArrayList<>();
		for (char c : limitChar) {
			limitList.add((int)c);			
		}		
		return limitList.contains(dice);		
	};
}