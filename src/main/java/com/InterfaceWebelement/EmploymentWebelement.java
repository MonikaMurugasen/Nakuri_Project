package com.InterfaceWebelement;

public interface EmploymentWebelement {
	String xpath_view="//span[text()='Employment']";

	String xpath_employment="//span[@id='add-employment']";
	String xpath_currentemployment="//label[@for='no']";
	String xpath_employmentType="//label[contains(text(),'Full-time')]";
	String id_companyname="companySugg";
	String xpath_clkname="//li[@data-id='4920767']";
	String id_jobtitle="designationSugg";
	String xpath_clkjob="(//div[contains(text(),'Tester')])[2]";
	String id_joiningyear="startedYearFor";
	String xpath_yearclk="//a[@data-id='startedYear_2023']";
	String id_joiningmounth="startedMonthFor";
	String xpath_mounthclk="//a[@data-id='startedMonth_4']";
	String id_workedtillyear="workedTillYearFor";
	String xpath_click="//a[@data-id='workedTillYear_2025']";
	String id_workedtillmounth="workedTillMonthFor";
	String xpath_clickmounth="//a[@data-id='workedTillMonth_7']";
	String id_skills="keySkillSugg";
	String id_jobprofile="jobDescription";
	String id_noticeperiod="noticePeriodFor";
	String xpath_option="//a[@data-id='noticePeriod_1']";
	String id_save="submitEmployment";
	
	
	
	

}
