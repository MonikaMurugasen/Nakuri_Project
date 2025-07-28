package com.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.EmploymentWebelement;
import com.base.BaseClass;
import com.utility.ExcelUtility;

public class EmploymentPage extends BaseClass implements EmploymentWebelement{

	@FindBy(xpath=xpath_view)
	private WebElement view;
	@FindBy(xpath=xpath_employment)
	private WebElement employment;
	
	
	
	@FindBy(xpath=xpath_currentemployment)
	private WebElement currentemployment;
	@FindBy(xpath=xpath_employmentType)
	private WebElement employmenttype;
	@FindBy(id=id_companyname)
	private WebElement companyname;
	@FindBy(xpath=xpath_clkname)
	private WebElement clkname;
	@FindBy(id=id_jobtitle)
	private WebElement jobtitle;
	@FindBy (xpath=xpath_clkjob)
	private WebElement clkjob;
	@FindBy(id=id_joiningyear)
	private WebElement joiningyear;
	@FindBy(xpath=xpath_yearclk)
	private WebElement yearclk;
	@FindBy(id=id_joiningmounth)
	private WebElement joiningmounth;
	@FindBy(xpath=xpath_mounthclk)
	private WebElement mounthclk;
	@FindBy(id=id_workedtillyear)
	private WebElement workedtillyear;
	@FindBy (xpath=xpath_click)
	private WebElement click;
	@FindBy(id=id_workedtillmounth)
	private WebElement workedtillmounth;
	@FindBy (xpath=xpath_clickmounth)
	private WebElement clickmounth;
	@FindBy(id=id_skills)
	private WebElement jobprofile;
	@FindBy(id=id_noticeperiod)
	private WebElement noticeperiod;
	@FindBy (xpath=xpath_option)
	private WebElement option;
	@FindBy (id=id_save)
	private WebElement save;
	
	
	
	public EmploymentPage() {
		PageFactory.initElements(driver, this);
	}
	public void NakuriEmployment() throws InterruptedException, IOException {
		jsClick(view);
		waitActions(employment, "explicitWait", null);
		 jsClick(employment);
	   jsClick(currentemployment);
	   jsClick(employmenttype);
	   printInput(companyname,ExcelUtility.getCellValue("DATA", "ID", "Current company name"));
	   waitActions(employment, "explicitWait", null);
	   jsClick(clkname);
	   printInput(jobtitle,ExcelUtility.getCellValue("DATA","ID","Current job title"));
	   waitActions(employment, "explicitWait", null);
	   jsClick(clkjob);
	   jsClick(joiningyear);
	   jsClick(yearclk);
	   jsClick(joiningmounth);
	   jsClick(mounthclk);
	   jsClick(workedtillyear);
	   jsClick(click);
	   jsClick(workedtillmounth);
	   jsClick(clickmounth);
	   robotActions("tab");
	   waitActions(employment, "explicitWait", null);
	   printInput(jobprofile,ExcelUtility.getCellValue("DATA", "ID", "Jobprofile"));
	   jsClick(noticeperiod);
	   jsClick(option);
	   jsClick(save);
		System.out.println("Print");
		
		
		
		
	}
	
	
	
	
	
	

}
