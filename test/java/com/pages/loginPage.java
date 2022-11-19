package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Baseclass;

public class loginPage extends Baseclass {
	
	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement txtpasword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpasword() {
		return txtpasword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void login(String username,String password ) {
		sendKeysAndEnter(getTxtusername(), username);
		sendKeysAndEnter(getTxtpasword(), password);
		elementclick(getBtnlogin());

	}
	
}
