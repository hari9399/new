package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class searchHotelPage extends Baseclass {
	
	public searchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username_show")
	private WebElement txtloginsuccess;

	@FindBy(id="location")
	private WebElement txtlocation;
	
	@FindBy(id="hotels")
	private WebElement txthotels;
	
	@FindBy(id="room_type")
	private WebElement txtroomtype;
	
	@FindBy(id="room_nos")
	private WebElement txtroomno;
	
	@FindBy(id="datepick_in")
	private WebElement txtdatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement txtdatepickout;
	
	@FindBy(id="adult_room")
	private WebElement txtadultroom;
	
	@FindBy(id="child_room")
	private WebElement txtchildroom;
	
	@FindBy(id="Submit")
	private WebElement btnsubmit;

	public WebElement getTxtloginsuccess() {
		return txtloginsuccess;
	}

	public WebElement getTxtlocation() {
		return txtlocation;
	}

	public WebElement getTxthotels() {
		return txthotels;
	}

	public WebElement getTxtroomtype() {
		return txtroomtype;
	}

	public WebElement getTxtroomno() {
		return txtroomno;
	}

	public WebElement getTxtdatepickin() {
		return txtdatepickin;
	}

	public WebElement getTxtdatepickout() {
		return txtdatepickout;
	}

	public WebElement getTxtadultroom() {
		return txtadultroom;
	}

	public WebElement getTxtchildroom() {
		return txtchildroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	public void searchhotels(String location,String hotels,String roomtype,String roomnos,
			String datepickin,String datepickout,String adultroom,String childroom) {
		sendKeysAndEnter(getTxtlocation(), location);
		sendKeysAndEnter(getTxthotels(), hotels);
		sendKeysAndEnter(getTxtroomtype(), roomtype);
		sendKeysAndEnter(getTxtroomno(), roomnos);
		sendKeysAndEnter(getTxtdatepickin(), datepickin);
		sendKeysAndEnter(getTxtdatepickout(), datepickout);
		sendKeysAndEnter(getTxtdatepickin(), datepickin);
		sendKeysAndEnter(getTxtdatepickout(), datepickout);

		elementclick(getBtnsubmit());
	}
	
	
	
}
