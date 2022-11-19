package org.testng;

import org.testng.annotations.Test;

public class test2 {
	@Test(groups="regression")
	private void tc10() {
		System.out.println("tc10");
	}
	
	@Test(groups="smoke")
	private void tc20() {
		System.out.println("tc20");
	}
	
	@Test(groups="sanity")
	private void tc30() {
		System.out.println("tc30");
	}

}
