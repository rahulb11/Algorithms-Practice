import java.util.HashSet;

public class BeautifulTriplets {
	int getBeautifulTriplets(int[] arr, int diff) {
		int result = 0;
		
		HashSet<Integer> arr_set = new HashSet<Integer>();
		
		for(int x : arr) {
			if(arr_set.contains(x-diff) && arr_set.contains(x-2*diff)) {
				result++;
			}
			arr_set.add(x);
		}
		
		return result;
	}
}
