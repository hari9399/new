package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	WebDriver driver;
	@BeforeMethod
	private void login1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}	
	@Parameters({"email","password"})
	@Test
	private void userlogin(String email,String password) {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys(email);
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys(password);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}	
	    @Parameters({"email","password"})
		@Test
		private void userlogin1(String email,String password) {
			WebElement txtusername = driver.findElement(By.id("email"));
			txtusername.sendKeys(email);
			WebElement txtpassword = driver.findElement(By.id("pass"));
			txtpassword.sendKeys(password);
			WebElement btnlogin = driver.findElement(By.name("login"));
			btnlogin.click();
	}
	@AfterMethod
	private void quit() {
		driver.quit();

	}

}
