package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//import org.junit.Test.*;

public class Test1 {

	@Test
	public void testName()
	{
		String name = "Troy";
		String name1 = "Troy";
		
		assertEquals(name,name1);
		
		System.out.println("Test Name");
	}
	
	@Test
	public void testCMP()
	{
		String c1 = "Eviden";
		String c2 = "Eviden";
		
		assertEquals(c1,c2);
		
		System.out.println("testCMP");
	}
	
	@Test
	public void testLocation()
	{
		String l1 = "Spain";
		String l2 = "Spain1";
		
		assertEquals(l1,l2);
		
		System.out.println("Test Location");
	}
	
}
