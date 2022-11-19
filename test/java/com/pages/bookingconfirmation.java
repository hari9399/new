package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class bookingconfirmation  extends Baseclass{
	public bookingconfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtbookingsuccess;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookitinerary;

	public WebElement getTxtbookingsuccess() {
		return txtbookingsuccess;
	}
	
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBookitinerary() {
		return bookitinerary;
	}

	public void bookcnfrm() {
		elementclick(getBookitinerary());

	}
}
