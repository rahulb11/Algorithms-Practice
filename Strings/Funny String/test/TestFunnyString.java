import junit.framework.TestCase;

public class TestFunnyString extends TestCase {
	public void testIsFunnyString() {
		FunnyString app = new FunnyString();
		
		String in = "acxz";
		String actual_out = app.isFunnyString(in);
		String expected_out = "Funny";
		
		System.out.println(actual_out);
		
		assertEquals(actual_out, expected_out);
	}
}
