//problem:
//count number of incorrect sos messages

//examples:
//input - SOSSOS, output - 0
//input - SOSSPS, output - 1

//strategy:
//iterate over each letter in the input
	//calculate the mod of the iterator index
	//if rem is 1 and not 'S', increment count
	//rem 2
	//rem 3
//return cout

//code
public class MarsExploration {
	int countErrors (String s) {
		int result = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int rem = (i + 1) % 3;
			char c = s.charAt(i);
			
			if(rem == 1 && c != 'S') {
				result++;
				continue;
			}
			
			if(rem == 2 && c != 'O') {
				result++;
				continue;
			}
			
			if(rem == 0 && c != 'S') {
				result++;
			}
		}
		
		return result;
	}
}
