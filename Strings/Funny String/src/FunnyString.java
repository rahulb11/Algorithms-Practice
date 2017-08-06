//Problem:
//check if string is funny

//Examples:
//acxz -> funny
//bcxz -> not funny

//Strategy:
//reverse the string
//iterate over each char in the string
	//if difference between i and i-1 is not same for in and rev, return "not funny"
//return "funny"

//Code:
public class FunnyString {
	public String isFunnyString(String in_str) {
		StringBuilder in = new StringBuilder(in_str);
		String rev_str = in.reverse().toString();
		
		for(int i = 1; i < in_str.length(); i++) {
			int diff_in = (int) Math.abs(in_str.charAt(i) - in_str.charAt(i-1));
			int diff_rev = (int) Math.abs(rev_str.charAt(i) - rev_str.charAt(i-1));
			if(diff_in != diff_rev) {
				return "Not Funny";
			}
		}
		
		return "Funny";
	}
}
