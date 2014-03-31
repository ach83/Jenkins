package test;

import static org.junit.Assert.*;

import org.junit.Test;

import operation.Soustraction;


public class TestSoustraction {

	@Test
	public void test() {
		Soustraction sousTest = new Soustraction();
		assertEquals( 1, sousTest.exe(2,1) );
	}

}
