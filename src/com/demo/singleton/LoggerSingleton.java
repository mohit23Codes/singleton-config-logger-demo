package com.demo.singleton;

public class LoggerSingleton {
	
	
	private static LoggerSingleton logger;
	
	private LoggerSingleton() {};
	
	public static LoggerSingleton getLogger() {
		
		if (logger == null) {
			
			logger = new LoggerSingleton();
		}
		
		return logger;
	}
	
	public void log(String msg) {
		
		System.out.println("[LOG] " + msg);
	}

}
