package test;

import static org.junit.Assert.*;
import operation.Multiplication;

import org.junit.Test;

public class TestMultiplication {

	@Test
	public void test() {
		Multiplication multTest = new Multiplication();
		assertEquals( 2,multTest.exe(1,2));
	}

}
