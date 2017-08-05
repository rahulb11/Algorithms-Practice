import junit.framework.TestCase;

public class TestPangrams extends TestCase {
	public void testIsPangram() {
		Pangrams app = new Pangrams();
		
		String in = "qwertyuiopasdfghjkl -zxcvbMN";
		String exp_out = "pangram";
		
		String actual_out = app.isPangram(in);
		
		System.out.println(actual_out);
		
		assertEquals(actual_out, exp_out);
	}
}
