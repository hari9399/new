package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class cancelBooking extends Baseclass{
	public cancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtorderid;
	
	@FindBy(id="search_hotel_id")
	private WebElement txthotelid;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[3]")
	private WebElement cancel;
	
//	@FindBy(xpath="//strong[text()='Cancel ']//following::tr[1]//following::td[3]")
//	private WebElement cancel;
	
	@FindBy(id="search_result_error")
	private WebElement txtsearchresult;
	
	public WebElement getTxtsearchresult() {
		return txtsearchresult;
	}

	public WebElement getTxtorderid() {
		return txtorderid;
	}

	public WebElement getTxthotelid() {
		return txthotelid;
	}
	public WebElement getCancel() {
		return cancel;
	}
	
//	public WebElement getCancel() {
//		return cancel;
//	}

	public void bookingcancel(String orderid) {
		sendKeysAndEnter(getTxtorderid(), orderid);
		elementclick(getTxthotelid());
		elementclick(getCancel());
		alertOk();

	}



}
