package com.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.ResumeHeadlineWebelement;
import com.base.BaseClass;
import com.utility.ExcelUtility;

public class ResumeHeadline extends BaseClass implements ResumeHeadlineWebelement {
	@FindBy (xpath=xpath_resumeHeadline)
	private WebElement headLineicon;
	@FindBy(id=id_resumeHeadlineText)
	private WebElement headLineText;
	@FindBy(xpath=xpath_saveheadline)
	private WebElement headLineSave;
	
	
	public ResumeHeadline() {
		PageFactory.initElements(driver, this);
	}
	public void NakuriResumeHeadline() throws IOException, InterruptedException {
		Thread.sleep(3000);
		jsClick(headLineicon);
		clear(headLineText);
		printInput(headLineText,ExcelUtility.getCellValue("DATA", "ID", "Resume headline"));
		Thread.sleep(3000);
	jsClick(headLineSave);
	}
	

}
