package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class bookahotel extends Baseclass{
	
	public bookahotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtbookhotelsuccess;

	@FindBy(id="first_name")
	private WebElement txtfirstname;
	
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(id="cc_type")
	private WebElement txtcctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement txtexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	
	@FindBy(id="book_now")
	private WebElement btnbooknow;
	
	public WebElement getTxtbookhotelsuccess() {
		return txtbookhotelsuccess;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getTxtcctype() {
		return txtcctype;
	}

	public WebElement getTxtexpmonth() {
		return txtexpmonth;
	}

	public WebElement getTxtccexpyear() {
		return txtccexpyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	
	public void bookthehotel(String firstname,String lastname,String address,String ccnum,
			String cctype,String ccexpmonth,String ccexpyear,String cvv) {
		sendKeysAndEnter(getTxtfirstname(), firstname);
		sendKeysAndEnter(getTxtlastname(), lastname);
		sendKeysAndEnter(getAddress(), address);
		sendKeysAndEnter(getCc_num(), ccnum);
		sendKeysAndEnter(getTxtcctype(), cctype);
		sendKeysAndEnter(getTxtexpmonth(), ccexpmonth);
		sendKeysAndEnter(getTxtccexpyear(), ccexpyear);
		sendKeysAndEnter(getTxtcvv(), cvv);
		elementclick(getBtnbooknow());
		
		
	}

}
