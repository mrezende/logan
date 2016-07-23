package com.logan.main;

public class LogAnalyzer {



	public boolean isValidLogFilename(String filename) {

		ExtensionManager extensionManager = new FileExtensionManager();
		return extensionManager.isValid(filename);

	}



}
