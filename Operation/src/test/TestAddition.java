package test;
import static org.junit.Assert.*;

import org.junit.Test;
import operation.Addition;

public class TestAddition {

	@Test
	public void test() {
		Addition addTest = new Addition();
		assertEquals( 3,addTest.exe(1,2));
	}

}
