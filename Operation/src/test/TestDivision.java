package test;

import static org.junit.Assert.*;
import operation.Banane;
import operation.Division;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestDivision {
	protected Division divTest;
	
	@Before
	public void setUp() {
		divTest = new Division();
    }
	
	@Rule
    public ExpectedException exception = ExpectedException.none();

	@Test
	public void test() throws Banane {
		assertEquals( 2, divTest.exe(4,2));
	}
	
	@Test
	public void testBanane() throws Banane {
		try{
			assertEquals( 4, divTest.exe(8,0));
		}
		catch (Banane b){
			assertEquals( "Caprice du client", b.getMessage());
		}
	}	
}