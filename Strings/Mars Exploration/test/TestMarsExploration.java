import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TestMarsExploration extends TestCase {

	
	public void testcountErrors() {
		MarsExploration app = new MarsExploration();
		
		String in = "SOSSPS";
		int exp_out = 1;
		int actual_out = app.countErrors(in);
		
		System.out.println(actual_out);
		
		assertEquals(exp_out, actual_out);
	}

}
