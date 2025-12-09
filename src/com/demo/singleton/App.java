package com.demo.singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConfigManager config = ConfigManager.getInstance();
		LoggerSingleton logger = LoggerSingleton.getLogger();
		
		logger.log("Application Started");
		
		String url = config.get("url");
		String browser = config.get("browser");
		
		logger.log("URL from config : " + url);
		logger.log("Browser from config : " + browser);
		
		ConfigManager config2 = ConfigManager.getInstance();
		logger.log("Are config and config2 same instance? " + (config == config2));
	}

}
