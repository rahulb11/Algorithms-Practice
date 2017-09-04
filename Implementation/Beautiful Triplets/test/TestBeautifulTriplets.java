import junit.framework.TestCase;

public class TestBeautifulTriplets extends TestCase {
	public void testBeautifulTriplets() {
		BeautifulTriplets app = new BeautifulTriplets();
		
		int[] arr = {1,2,4,5,7,8,10};
		int diff = 3;
		
		int exp_output = 3;
		int actual_output = app.getBeautifulTriplets(arr, diff);
		
		System.out.println(actual_output);
		
		assertEquals(exp_output, actual_output);
	}
}
