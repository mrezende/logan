package com.logan.main;

public class LogAnalyzer {

	ExtensionManager manager;

	public LogAnalyzer(ExtensionManager manager) {
		this.manager = manager;
	}

	public boolean isValidLogFilename(String filename) {

		return manager.isValid(filename);

	}



}
