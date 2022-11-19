package org.Junit;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.test.Baseclass;

public class JunitExcelTask extends Baseclass{
	@BeforeClass
	public static void beforeclass() {
		getdriver();
		EnterAppUrl("https://adactinhotelapp.com/");
		MaximizeWindow();
	}
	@Test
	public void booking() throws IOException, InterruptedException {
		WebElement txtusername =findelementbyid("username");
		String name = readDataFromCell("datas", 1, 0);
		sendKeysAndEnter(txtusername, name);
		
		WebElement txtpasword = findelementbyid("password");
		String pass =readDataFromCell("datas", 1,1);
		sendKeysAndEnter(txtpasword, pass);
		
		WebElement btnlogin =findelementbyid("login");
	    elementclick(btnlogin);
	    
	    WebElement txtloginsuccess = findelementbyid("username_show");
	    String actloginsuccess = elementgetattribute(txtloginsuccess);
		
	    Assert.assertEquals("verify after login success", "Hello haran9399!",actloginsuccess);
	    System.out.println(actloginsuccess);
	    
	    WebElement txtlocation = findelementbyid("location");
		String location =readDataFromCell("datas", 1, 2);
		sendKeysAndEnter(txtlocation, location);

		WebElement txthotels = findelementbyid("hotels");
		String hotels =readDataFromCell("datas", 1, 3);
		sendKeysAndEnter(txthotels, hotels);
		
		WebElement txtroomtype =findelementbyid("room_type");
		String roomtype =readDataFromCell("datas", 1, 4);
		sendKeysAndEnter(txtroomtype, roomtype);
		
		WebElement txtroomno =findelementbyid("room_nos");
		String roomno =readDataFromCell("datas", 1, 5);
		sendKeysAndEnter(txtroomno, roomno);
		
		WebElement txtdatepickin =findelementbyid("datepick_in");
		String datepickin =readDataFromCell("datas", 1, 6);
		sendKeysAndEnter(txtdatepickin, datepickin);
		
		WebElement txtdatepickout =findelementbyid("datepick_out");
		String datepickout =readDataFromCell("datas", 1, 7);
		sendKeysAndEnter(txtdatepickout, datepickout);
		
		WebElement txtadultroom =findelementbyid("adult_room");
		String adultroom =readDataFromCell("datas", 1, 8);
		sendKeysAndEnter(txtadultroom, adultroom);
		
		WebElement txtchildroom =findelementbyid("child_room");
		String childroom =readDataFromCell("datas", 1, 9);
		sendKeysAndEnter(txtchildroom, childroom);
		
		WebElement btnsubmit =findelementbyid("Submit");
	    elementclick(btnsubmit);
	    
	    WebElement txtselecthotel = findelementbyxpath("//td[text()='Select Hotel ']");
	    String selecthotel = elementgettext(txtselecthotel);
	    Assert.assertEquals("verify after select hotel", "Select Hotel", selecthotel);
	    System.out.println(selecthotel);
	   
	    WebElement btnradio = findelementbyid("radiobutton_0");
	    elementclick(btnradio);
	    
	    WebElement btncontinue = findelementbyid("continue");
	    elementclick(btncontinue);
	    
	    WebElement txtbookhotelsuccess = findelementbyxpath("//td[text()='Book A Hotel ']");
	    String bookhotelsuccess = elementgettext(txtbookhotelsuccess);
	    
	    Assert.assertEquals("verify after book hotel success", "Book A Hotel",bookhotelsuccess);
	    System.out.println(bookhotelsuccess);
		
	    WebElement txtfirstname = findelementbyid("first_name");
		String firstname = readDataFromCell("datas", 1, 10);
		sendKeysAndEnter(txtfirstname, firstname);
		
		WebElement txtlastname = findelementbyid("last_name");
		String lastname = readDataFromCell("datas", 1, 11);
		sendKeysAndEnter(txtlastname, lastname);
		
		WebElement txtaddress = findelementbyid("address");
		String address = readDataFromCell("datas", 1, 12);
		sendKeysAndEnter(txtaddress, address);
		
		WebElement txtccnum =findelementbyid("cc_num");
		String ccnum = readDataFromCell("datas", 1, 13);
		sendKeysAndEnter(txtccnum, ccnum);
		
		WebElement txtcctype = findelementbyid("cc_type");
		String cctype = readDataFromCell("datas", 1, 14);
		sendKeysAndEnter(txtcctype, cctype);
		
		WebElement txtexpmonth = findelementbyid("cc_exp_month");
		String expmonth =readDataFromCell("datas", 1, 15);
		sendKeysAndEnter(txtexpmonth,expmonth);
		
		WebElement txtccexpyear = findelementbyid("cc_exp_year");
		String ccexpyear = readDataFromCell("datas", 1, 16);
		sendKeysAndEnter(txtccexpyear, ccexpyear);
		
		WebElement txtcvv = findelementbyid("cc_cvv");
		String cvv = readDataFromCell("datas", 1, 17);
		sendKeysAndEnter(txtcvv, cvv);
		
		WebElement btnbooknow = findelementbyid("book_now");
		elementclick(btnbooknow);
		
		Thread.sleep(10000);
		
		WebElement txtbookingsuccess = findelementbyxpath("//td[text()='Booking Confirmation ']");
	    String bookingsuccess =elementgettext(txtbookingsuccess);
		    
		Assert.assertEquals("verify after booking success","Booking Confirmation",bookingsuccess);
		System.out.println(bookingsuccess);
		

		WebElement txtorderno =findelementbyid("order_no");
		String orderno =elementgetattribute(txtorderno);
		System.out.println(orderno);	
		writeCellData("datas", 1, 18, orderno);
	}
	
	@AfterClass
	public static void afterclass() {
    quitwindow();

}
}
