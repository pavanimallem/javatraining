package com.hcl.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestData {
	static Data data;
	@BeforeClass
	public static void setUp() {
		data=new Data();
	}
	@Test
	public void testDiv() {
		assertEquals(1, data.div(5,4));
	}
	@Test
	public void testGetpropertyTest() {
		assertNotNull(data.getProperty("pavani"));
		assertNull(data.getProperty("suresh"));
	}
	@Test
	public void testEven() {
		assertTrue(data.even(10));
		assertFalse(data.even(11));
	}
	@Test
	public void testminArray() {
		int[] a={-1,4,7,2,35};
		assertEquals(-1, data.minArray(a));
		assertEquals(-1, data.minArray(new int[]{-1,4,7,2,35}));
	}
	@Test
	public void testmax3() {
		assertEquals(5, data.max3(5, 2, 3));
		assertEquals(5, data.max3(2, 5, 3));
		assertEquals(5, data.max3(2, 3, 5));
	}
	//@Ignore
	@Test
	public void testSum() {
		assertEquals(5, data.sum(2, 3));
	}
	@Test
	public void testsayHello() {
		Data data =new Data();
		assertEquals("welcome to junit..",data.sayHello());
	}
	@AfterClass
	public static void tearDown() {
		data=null;
	}

}
