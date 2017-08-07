import java.util.Scanner;

//Problem:
//find the number of gemstones in the given number of rocks

//Examples:
//3
//abcdde
//baccd
//eeabg
//output - 2 (a and b)

//Strategy:
//go over rock 1 and build int array
//go over rock 2 and build int array
//go over rock n and build int array
//and all the boolean arrays of rock and return count of true values in it

public class Gemstones {
	public int gemstones(String[] rocks) {
		int count = 0;
		
		int[][] arr = new int[rocks.length][128];
		
		for(int i = 0; i < rocks.length; i++) {
			makeArray(arr,rocks[i],i);
		}
		
		for(int i = 0; i < 128; i++) {
			for(int j = 1; j < rocks.length; j++) {
				arr[0][i] *= arr[j][i];
			}
			if(arr[0][i] == 1) {
				count++;
			}
		}
		
		return count;
	}
	public void makeArray(int[][] arr, String s, int i) {
		for(int j = 0; j < s.length(); j++) {
			arr[i][s.charAt(j)] = 1;
		}
	}
}
