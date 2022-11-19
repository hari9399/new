package org.testng;

import org.testng.annotations.Test;

public class test1 {

	@Test(groups="regression")
	private void tc1() {
		System.out.println("tc1");
	}
	
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("tc2");
	}
	
	@Test(groups="sanity")
	private void tc3() {
		System.out.println("tc3");
	}
	
}
