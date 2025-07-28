package com.PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.KeySkillsWebelement;
import com.base.BaseClass;
import com.utility.ExcelUtility;

public class KeySkills extends BaseClass implements KeySkillsWebelement {
	@FindBy(xpath=xpath_keySkillsicon)
	private WebElement keyskillsicon;
	@FindBy(linkText=linkText_deleteoption)
	private WebElement deleteoption;
	
	@FindBy(name=name_Skillsname)
	private WebElement typeSkillsName;
	@FindBy(xpath=xpath_SkillsOption)
	private WebElement clickSkillsOption;
	@FindBy(id=id_SkillSave)
	private WebElement saveSkills;
	
	public KeySkills() {
		PageFactory.initElements(driver,this);
	}
	public void NakuriKeySkills() throws IOException, InterruptedException {
		Thread.sleep(3000);
		jsClick(keyskillsicon);
		Thread.sleep(3000);
		jsClick(deleteoption);
		printInput(typeSkillsName,ExcelUtility.getCellValue("DATA", "ID", "Key skills"));
		mouseAction("click", clickSkillsOption);
		mouseAction("click", saveSkills);
		
	}

}
