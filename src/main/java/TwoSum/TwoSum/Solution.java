package TwoSum.TwoSum;
import java.util.*;


public class Solution {
	public int[] solve(int[] values, int target) {
		HashMap<Integer, Integer> valueMap = new HashMap<Integer, Integer>();
		for(int i=0;i<values.length;i++) {
			int value = values[i];
			valueMap.put(value, i);
		}
		for(int i=0;i<values.length;i++) {
			int value = values[i];
			int remValue = target-value;
			if(valueMap.containsKey(remValue)) {
				int index = valueMap.get(remValue);
				if(index != i) {
					int[] indexes = new int[2];
					indexes[0]=i;
					indexes[1]=index;
					return indexes;
				}
			}
		}
		return null;
	}
}
