package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.ENV;

public class PrpoertiesUtil {

	public static String readProperty(ENV env, String propertyName) {
		
		File propFile = new File(System.getProperty("user.dir") + "\\config\\" + env + ".properties");
		FileReader fileReader = null;
		Properties properties = new Properties();
		try {
			fileReader = new FileReader(propFile);
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			 catch (IOException e) {
			e.printStackTrace();
		}
		
		String homeURL = properties.getProperty(propertyName.toUpperCase());
		return homeURL;
	}
}
