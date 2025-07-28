package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManager {
	private static FileInputStream fileInputSteam;
	private static Properties property;
	

	private static void setProperty() {
		File file = new File(
				"C:\\Users\\Pradeep\\eclipse-workspace\\NakuriTestNG\\src\\main\\resources\\NakuriData.properties");
		try {
			fileInputSteam = new FileInputStream(file);
			property = new Properties();// to load files
			property.load(fileInputSteam);
		} catch (FileNotFoundException e) {
			Assert.fail("Error Occur : During File Loading");
		} catch (Exception e) {
			Assert.fail("Error Occur : During Reading File");
		}
	}

	public static String getDataProperty(String dataValue) {
		setProperty();// getdataproperty has "browser"String inside the datavariable(data)
						// setproperty is called to load the file (open to find key values)
		String data = property.getProperty(dataValue);// returns the browser value given in NakuriData.properties
		return data;// returns in runner class
}
	
	

}
