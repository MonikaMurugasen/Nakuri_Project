package com.runner;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjectManager.PageObjectManager;
import com.base.BaseClass;

public class NakuriRunner extends BaseClass {
	
	@Test(priority = 1)
public void launchBrowser() throws InterruptedException, IOException {
		browserLaunch(PageObjectManager.getPOMA().getFileReaderManagerClass().getDataProperty("browser"));
		browserUrls(PageObjectManager.getPOMA().getFileReaderManagerClass().getDataProperty("url"), "directLink");
		PageObjectManager.getPOMA().getLoginPageClass().NakuriLogin();
		}
	
		@Test(priority = 2)
		public void NakuriProfile() throws InterruptedException {
		PageObjectManager.getPOMA().getProfileupdateClass().NakuriProfileUpdate();
		}
//		
//		@Test(priority = 3)
//	public void NakuriResume() throws IOException, InterruptedException {
//		PageObjectManager.getPOMA().getResumeHeadlineClass().NakuriResumeHeadline();
//		}
		
//		@Test(priority = 4)
//		public void NakuriKeySkills() throws IOException, InterruptedException {
//		PageObjectManager.getPOMA().getKeySkillsClass().NakuriKeySkills();
//		}
//		
//		@Test(priority = 5)
//		public void NakuriEmploymentPage() throws InterruptedException, IOException {
//		PageObjectManager.getPOMA().getEmploymentPageObject().NakuriEmployment();
//		}
		
//		@Test
//		public void NakuriEducation() throws InterruptedException {
//			PageObjectManager.getPOMA().getEducationClass().NakuriEducation();
//		}
		
	@Test
	public void NakuriItPage() {
		PageObjectManager.getPOMA().getItSkillclass().NakuriItPage();
	}
	


}
