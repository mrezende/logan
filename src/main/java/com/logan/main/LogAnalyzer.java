package com.logan.main;

public class LogAnalyzer {

	public boolean isValidLogFilename(String filename) {
		if (!filename.toUpperCase().endsWith(".SLF")) {
			return false;
		}
		return true;
	}

}
