package com.flipcart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C1 extends Base{
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	private WebElement electronic;
	
	@FindBy(xpath="//button[contains(text(),'✕')]")
	private WebElement f;

	public WebElement getF() {
		return f;
	}

	public WebElement getElectronic() {
		return electronic;
	}

	public void setElectronic(WebElement electronic) {
		this.electronic = electronic;
	}
	
	public C1() {
		PageFactory.initElements(driver, this);
	}
	
}
