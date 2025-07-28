package com.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceWebelement.ItSkill;
import com.base.BaseClass;

public class ItSkillPage extends BaseClass implements ItSkill {
	@FindBy(xpath=xpath_click)
	private WebElement click;
	public ItSkillPage() {
		PageFactory.initElements(driver, this);
		}
	public void NakuriItPage() {
		mouseAction("click", click);
	}

}
