package org.testng;

import org.testng.annotations.Test;

public class test3 {
	@Test(groups="smoke")
	private void tc100() {
		System.out.println("tc100");
	}
	
	@Test(groups="sanity")
	private void tc200() {
		System.out.println("tc200");
	}
	
	@Test(groups="regression")
	private void tc300() {
		System.out.println("tc300");
	}

}
