package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	@Test
	public void login() {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("haran9399");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("Hari@123");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
	@After
	public void aftermethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);

	}
	@Before
	public void beforemethod() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
	}

}
