package com.demo.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	
	
	private static ConfigManager instance;
	private Properties prop;
	
	private ConfigManager() {
		
		prop = new Properties();
		
		try(InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")){
			
			if(input == null) {
				
				System.out.println("the config file cannot be found");
				return;
			}
			
			prop.load(input);
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
	};
	
	public static ConfigManager getInstance() {
		
		if(instance == null) {
			
			instance = new ConfigManager();
		}
		
		return instance;
	}
	
	public String get(String key) {
		
		return prop.getProperty(key);
	
	}
	
}
