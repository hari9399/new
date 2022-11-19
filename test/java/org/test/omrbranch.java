package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class omrbranch {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
	    driver.manage().window().maximize();	   
	    WebElement countrylist = driver.findElement(By.id("country-list"));
	    Select s= new Select(countrylist);	    	
	    List<WebElement> list = s.getOptions();	    
	    int size = list.size();	    
	    System.out.println(size);	    
	    File file=new File("C:\\Users\\ezhil\\eclipse-workspace\\maven\\Excel\\country.xlsx");	    
	    Workbook workbook=new XSSFWorkbook();	    
	    Sheet sheet1 = workbook.createSheet("countrylist");	    
	    for (int i = 0; i < list.size(); i++) {	    
	    	WebElement webElement = list.get(i);	    	
	    	String text = webElement.getText();	    	
	    	System.out.println(text);	    	
	    	Row row = sheet1.createRow(i);	    	
	    	Cell Cell = row.createCell(0);	    	
	    	Cell.setCellValue(text);
	         }
	    	 FileOutputStream out =new FileOutputStream(file);
	 	    workbook.write(out);
}
}