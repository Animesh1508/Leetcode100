package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.ENV;
import com.google.gson.Gson;
import com.ui.pojo.Config;
import com.ui.pojo.Environment;

public class JSONUtility {

	public static String readJson(ENV env) {
		Gson gson = new Gson();
		
		File gsonFile = new File(System.getProperty("user.dir")+ "//config//config.json");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(gsonFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Config config = gson.fromJson(fileReader, Config.class);
		Environment environment = config.getEnvironments().get("QA");
		
		return environment.getUrl();
	}

}
