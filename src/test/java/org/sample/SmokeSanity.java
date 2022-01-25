package org.sample;



import org.testng.annotations.Test;

public class SmokeSanity {
	
	@Test
	private void tc1() {
		
	System.out.println("Test 1");
	

	}
	
	@Test (groups = "sanity")
	private void tc2() {
	System.out.println("Test 2");

	}
	@Test (groups = "smoke")
	private void tc3() {
	System.out.println("Test 3");

	}
	
	@Test (groups = "sanity")
	private void tc4() {
	System.out.println("Test 4");

	}
	
	@Test (groups = "smoke")
	private void tc5() {
	System.out.println("Test 5");

	}
	
	@Test (groups = "sanity")
	private void tc6() {
	System.out.println("Test 6");

	}
	

}
