package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.Educationinterface;
import com.base.BaseClass;

public class EducationPage extends BaseClass implements Educationinterface{
	@FindBy(xpath=xpath_addeducation)
	private WebElement addeducation;
	@FindBy(id=id_educationclk)
	private WebElement educationclk;
	@FindBy(xpath=xpath_education)
	private WebElement education;
	@FindBy (id=id_institute)
	private WebElement institue;
	@FindBy(xpath=xpath_instituteclk)
	private WebElement instituteclk;
	
public EducationPage() {
	PageFactory.initElements(driver, this);
}
public void NakuriEducation() throws InterruptedException {
	Thread.sleep(3000);
	jsClick(addeducation);
	jsClick(educationclk);
	jsClick(education);
	jsClick(addeducation);
}
}
