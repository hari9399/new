package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertion {
	@Test
	private void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("facebook");
		System.out.println(contains);
		Assert.assertTrue(contains);
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("hari123@gmail.com");
		String attribute = txtusername.getAttribute("value");
		Assert.assertEquals(attribute, "hari123@gmail.com");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("hari@123");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();

}

}
