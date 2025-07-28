package com.PageObjectManager;

import com.InterfaceWebelement.Educationinterface;
import com.PageObjectModel.EducationPage;
import com.PageObjectModel.EmploymentPage;
import com.PageObjectModel.ItSkillPage;
//import com.InterfaceWebelement.EmploymentWebelement;
//import com.PageObjectModel.EmploymentPage;
import com.PageObjectModel.KeySkills;
import com.PageObjectModel.LoginPage;
import com.PageObjectModel.ProfileUpdatePage;
import com.PageObjectModel.ResumeHeadline;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private LoginPage loginPageClass;
	private FileReaderManager fileReaderManagerClass;
	private static PageObjectManager POMA;
	private ProfileUpdatePage profileupdateClass;
	private ResumeHeadline resumeHeadlineClass;
	private KeySkills keySkillsClass;
	private EducationPage educationClass;
	private ItSkillPage ItSkillclass;
	
	
	public ItSkillPage getItSkillclass() {
		if(ItSkillclass==null) {
			ItSkillclass=new ItSkillPage();
		}
		return ItSkillclass;
	}
	private EmploymentPage employmentPageObject;
	

	public EmploymentPage getEmploymentPageObject() {
		if(employmentPageObject==null) {
			employmentPageObject=new EmploymentPage();
		}
		return employmentPageObject;
	}

	public KeySkills getKeySkillsClass() {
		if(keySkillsClass==null) {
			keySkillsClass= new KeySkills();
		}
		return keySkillsClass;
	}

	

	public EducationPage getEducationClass() {
		if(educationClass==null) {
			educationClass=new EducationPage();
			
			
		}
		return educationClass;
	}



	public ResumeHeadline getResumeHeadlineClass() {
		if(resumeHeadlineClass== null) {
			resumeHeadlineClass=new ResumeHeadline();
			
		}
		return resumeHeadlineClass;
	}

	public ProfileUpdatePage getProfileupdateClass() {
		if(profileupdateClass==null) {
			profileupdateClass = new ProfileUpdatePage();
		}
		return profileupdateClass;
	}

	public FileReaderManager getFileReaderManagerClass() {
		if (fileReaderManagerClass == null) {
			fileReaderManagerClass = new FileReaderManager();
		}
		return fileReaderManagerClass;
	}

	public LoginPage getLoginPageClass() {
		if (loginPageClass == null) {// Checks weather loginpage class is present or not
			loginPageClass = new LoginPage();// if not creat an object for login page
		}
		return loginPageClass;
	}
	
	public static PageObjectManager getPOMA() {
		if (POMA== null) {
			POMA= new PageObjectManager();
			
		}
		return POMA;
	}
	public PageObjectManager() {
	}

}
