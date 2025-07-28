package com.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.LoginInterfaceWebelement;
import com.PageObjectManager.PageObjectManager;
import com.base.BaseClass;
import com.utility.ExcelUtility;

public class LoginPage extends BaseClass implements LoginInterfaceWebelement {
	@FindBy(linkText = loginbtn_linktext)
	private WebElement Loginbtn;

	@FindBy(xpath = username_xpath)
	private WebElement Username;

	@FindBy(xpath = Password_xpath)
	private WebElement Password;

	@FindBy(xpath = Clickbtn_Xpath)
	private WebElement Signinbtn;
	@FindBy(xpath = valid_xpath)
	private WebElement title;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void NakuriLogin() throws InterruptedException, IOException {
		//try {
            mouseAction("click", Loginbtn);
			Thread.sleep(2000);
			printInput(Username, PageObjectManager.getPOMA().getFileReaderManagerClass().getDataProperty("username"));
			printInput(Password, PageObjectManager.getPOMA().getFileReaderManagerClass().getDataProperty("password"));
			mouseAction("click", Signinbtn);
			Thread.sleep(2000);
		validation(title,ExcelUtility.getCellValue("DATA", "ID", "title"));
	//	} catch (IOException e) {
		//	e.printStackTrace();
		}

//	}

}
