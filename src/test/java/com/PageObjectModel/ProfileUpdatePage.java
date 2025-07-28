package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.ProfileUpdatePageInterfaceElement;
import com.base.BaseClass;

public class ProfileUpdatePage extends BaseClass implements ProfileUpdatePageInterfaceElement {
	@FindBy(xpath = btnclick_xpath)
	private WebElement threelinebtn;
	
	@FindBy(xpath=updateclick_xpath)
	private WebElement Upadatebtn;
//	@FindBy(xpath=basicdetailclk_xpath)
//	private WebElement basicdetails;
//	@FindBy(id=name_id)
//	private WebElement name;
//	
	
	
	public ProfileUpdatePage() {
		PageFactory.initElements(driver,this);
	}
	public void NakuriProfileUpdate() throws InterruptedException {
		Thread.sleep(2000);
		jsClick(threelinebtn);
		jsClick(Upadatebtn);
		Thread.sleep(2000);
//		jsClick(basicdetails);
//		Thread.sleep(2000);
//		clear(name);
		
	}
	
	

}
