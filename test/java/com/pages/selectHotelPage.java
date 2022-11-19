package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class selectHotelPage extends Baseclass {
	
	public selectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement txtselecthotel;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;

	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getTxtselecthotel() {
		return txtselecthotel;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
    public void selecthotel() {
	    elementclick(getBtnradio());
	    elementclick(getBtncontinue());
}

}
