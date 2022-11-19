package com.pages;


	import java.io.IOException;

	import org.junit.AfterClass;
	import org.junit.Assert;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.WebElement;
	import org.test.Baseclass;
	
	public class baseClassExcelJuintPom extends Baseclass {

		@BeforeClass
		public static void beforeclass() {
			getdriver();
			EnterAppUrl("https://adactinhotelapp.com/");
			MaximizeWindow();
		}
		@Test
		public void booking() throws IOException, InterruptedException {
			loginPage loginpage=new loginPage();
			loginpage.login(readDataFromCell("datas", 1, 0), readDataFromCell("datas", 1,1));
		
			searchHotelPage searchpage=new searchHotelPage();
			WebElement txtloginsuccess = searchpage.getTxtloginsuccess();
			String actloginsuccess = elementgetattribute(txtloginsuccess);
			Assert.assertEquals("verify after login success", "Hello haran9399!",actloginsuccess);
			System.out.println(actloginsuccess);
	        
			searchpage.searchhotels(readDataFromCell("datas", 1, 2), readDataFromCell("datas", 1, 3),
					readDataFromCell("datas", 1, 4), readDataFromCell("datas", 1, 5), 
					readDataFromCell("datas", 1, 6), readDataFromCell("datas", 1, 7),
					readDataFromCell("datas", 1, 8), readDataFromCell("datas", 1, 9));
	        
			selectHotelPage selectahotel=new selectHotelPage();
			WebElement txtselecthotel = selectahotel.getTxtselecthotel();
		    String selecthotel = elementgettext(txtselecthotel);
		    Assert.assertEquals("verify after select hotel", "Select Hotel", selecthotel);
		    System.out.println(selecthotel);
		    
		    selectahotel.selecthotel();
		    
		    bookahotel bookhotel=new bookahotel();
		    WebElement txtbookhotelsuccess = bookhotel.getTxtbookhotelsuccess();
		    String bookhotelsuccess = elementgettext(txtbookhotelsuccess);
		    Assert.assertEquals("verify after book hotel success", "Book A Hotel",bookhotelsuccess);
		    System.out.println(bookhotelsuccess);
			
		    bookhotel.bookthehotel(readDataFromCell("datas", 1, 10), readDataFromCell("datas", 1, 11),
		    		readDataFromCell("datas", 1, 12), readDataFromCell("datas", 1, 13), 
		    		readDataFromCell("datas", 1, 14), readDataFromCell("datas", 1, 15),
		    		readDataFromCell("datas", 1, 16), readDataFromCell("datas", 1, 17));
			Thread.sleep(10000);
			bookingconfirmation bookingcnfrm=new bookingconfirmation();
			WebElement txtbookingsuccess = bookingcnfrm.getTxtbookingsuccess();
			String bookingsuccess =elementgettext(txtbookingsuccess);   
			Assert.assertEquals("verify after booking success","Booking Confirmation",bookingsuccess);
			System.out.println(bookingsuccess);	
			
		    WebElement orderno = bookingcnfrm.getOrderno();
		    String elementgetattribute = elementgetattribute(orderno);
		    System.out.println(elementgetattribute);
			writeCellData("datas", 1, 18, elementgetattribute);
			bookingcnfrm.bookcnfrm();
			cancelBooking cancelBook=new cancelBooking();
			cancelBook.bookingcancel(readDataFromCell("datas", 1, 18));
			
			WebElement cancel = cancelBook.getTxtsearchresult();
			String bookingcancelled = elementgettext(cancel);
			Assert.assertEquals("verify after booking cancelled","The booking has been cancelled.",bookingcancelled);
			System.out.println(bookingcancelled);	

		}
		
		@AfterClass
		public static void afterclass() {
	    quitwindow();

	}
	}

	

