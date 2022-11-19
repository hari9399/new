package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class BaseclassExceltask {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	BaseclassExceltask employee= new BaseclassExceltask();
	employee.booking();
	}
	private void booking() throws IOException, InterruptedException {
	Baseclass Baseclass=new Baseclass();
	Baseclass.getdriver();
	
	Baseclass.EnterAppUrl("https://adactinhotelapp.com/index.php");
	
	Baseclass.MaximizeWindow();
	
	WebElement txtusername = Baseclass.findelementbyid("username");
	
	String name = Baseclass.readDataFromCell("datas", 1, 0);
	Baseclass.sendKeysAndEnter(txtusername, name);
	
	WebElement txtpasword = Baseclass.findelementbyid("password");
	String pass = Baseclass.readDataFromCell("datas", 1,1);
	Baseclass.sendKeysAndEnter(txtpasword, pass);
	
	WebElement btnlogin = Baseclass.findelementbyid("login");
    Baseclass.elementclick(btnlogin);
    
	WebElement txtlocation = Baseclass.findelementbyid("location");
	String location = Baseclass.readDataFromCell("datas", 1, 2);
	Baseclass.sendKeysAndEnter(txtlocation, location);

	WebElement txthotels = Baseclass.findelementbyid("hotels");
	String hotels = Baseclass.readDataFromCell("datas", 1, 3);
	Baseclass.sendKeysAndEnter(txthotels, hotels);
	
	WebElement txtroomtype = Baseclass.findelementbyid("room_type");
	String roomtype = Baseclass.readDataFromCell("datas", 1, 4);
	Baseclass.sendKeysAndEnter(txtroomtype, roomtype);
	
	WebElement txtroomno = Baseclass.findelementbyid("room_nos");
	String roomno = Baseclass.readDataFromCell("datas", 1, 5);
	Baseclass.sendKeysAndEnter(txtroomno, roomno);
	
	WebElement txtdatepickin = Baseclass.findelementbyid("datepick_in");
	String datepickin = Baseclass.readDataFromCell("datas", 1, 6);
	Baseclass.sendKeysAndEnter(txtdatepickin, datepickin);
	
	WebElement txtdatepickout = Baseclass.findelementbyid("datepick_out");
	String datepickout = Baseclass.readDataFromCell("datas", 1, 7);
	Baseclass.sendKeysAndEnter(txtdatepickout, datepickout);
	
	WebElement txtadultroom = Baseclass.findelementbyid("adult_room");
	String adultroom = Baseclass.readDataFromCell("datas", 1, 8);
	Baseclass.sendKeysAndEnter(txtadultroom, adultroom);
	
	WebElement txtchildroom = Baseclass.findelementbyid("child_room");
	String childroom = Baseclass.readDataFromCell("datas", 1, 9);
	Baseclass.sendKeysAndEnter(txtchildroom, childroom);
	
	WebElement btnsubmit = Baseclass.findelementbyid("Submit");
    Baseclass.elementclick(btnsubmit);
    
    WebElement btnradio = Baseclass.findelementbyid("radiobutton_0");
    Baseclass.elementclick(btnradio);
    
    WebElement btncontinue = Baseclass.findelementbyid("continue");
    Baseclass.elementclick(btncontinue);
	
    WebElement txtfirstname = Baseclass.findelementbyid("first_name");
	String firstname = Baseclass.readDataFromCell("datas", 1, 10);
	Baseclass.sendKeysAndEnter(txtfirstname, firstname);
	
	WebElement txtlastname = Baseclass.findelementbyid("last_name");
	String lastname = Baseclass.readDataFromCell("datas", 1, 11);
	Baseclass.sendKeysAndEnter(txtlastname, lastname);
	
	WebElement txtaddress = Baseclass.findelementbyid("address");
	String address = Baseclass.readDataFromCell("datas", 1, 12);
	Baseclass.sendKeysAndEnter(txtaddress, address);
	
	WebElement txtccnum = Baseclass.findelementbyid("cc_num");
	String ccnum = Baseclass.readDataFromCell("datas", 1, 13);
	Baseclass.sendKeysAndEnter(txtccnum, ccnum);
	
	WebElement txtcctype = Baseclass.findelementbyid("cc_type");
	String cctype = Baseclass.readDataFromCell("datas", 1, 14);
	Baseclass.sendKeysAndEnter(txtcctype, cctype);
	
	WebElement txtexpmonth = Baseclass.findelementbyid("cc_exp_month");
	String expmonth = Baseclass.readDataFromCell("datas", 1, 15);
	Baseclass.sendKeysAndEnter(txtexpmonth, expmonth);
	
	WebElement txtccexpyear = Baseclass.findelementbyid("cc_exp_year");
	String ccexpyear = Baseclass.readDataFromCell("datas", 1, 16);
	Baseclass.sendKeysAndEnter(txtccexpyear, ccexpyear);
	
	WebElement txtcvv = Baseclass.findelementbyid("cc_cvv");
	String cvv = Baseclass.readDataFromCell("datas", 1, 17);
	Baseclass.sendKeysAndEnter(txtcvv, cvv);
	
	WebElement btnbooknow = Baseclass.findelementbyid("book_now");
	Baseclass.elementclick(btnbooknow);
	
	Thread.sleep(10000);
	
	WebElement txtorderno = Baseclass.findelementbyid("order_no");
	String orderno = Baseclass.elementgetattribute(txtorderno);
	System.out.println(orderno);	
	Baseclass.writeCellData("datas", 1, 18, orderno);
    Baseclass.quitwindow();
	}

}
