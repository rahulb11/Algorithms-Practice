//Problem:
//To check if the input string has all letters in it

//Examples:
//Input - perftesting, output - not pangram
//Input - qwertyuiopasdfghjkl zxcvbMN, output - pangram

//Strategy
//convert all to lower case
//iterate over each char
	//increment the count for each char as index
//check if letters 'a' to 'z' have at least one in the array

public class Pangrams {
	public String isPangram(String in) {
		
		if(in.length() < 26) {
			return "not pangram";
		}
		
		in = in.toLowerCase();
		int[] arr = new int[128];
		
		for(int i = 0; i < in.length(); i++) {
			arr[in.charAt(i)]++;
		}
		
		for(int i = 'a'; i <= 'z'; i++) {
			if(arr[i] == 0) {
				return "not pangram";
			}
		}
		
		return "pangram";
	}
}
