import junit.framework.TestCase;

public class TestGemstones extends TestCase {
	public void testGemStones() {
		Gemstones app = new Gemstones();
		
		String[] inp = {"abcdde","baccd","eeabg"};
		int actual_out = app.gemstones(inp);
		
		System.out.println(actual_out);
		
		int exp_out = 2;
		
		assertEquals(actual_out, exp_out);
	}
}
