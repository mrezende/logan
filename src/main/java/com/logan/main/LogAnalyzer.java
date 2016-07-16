package com.logan.main;

public class LogAnalyzer {

	public boolean isValidLogFilename(String filename) {

		if(filename == null || filename.trim() == "") {
			throw new IllegalArgumentException("filename has to be provided");
		}

		if (!filename.toUpperCase().endsWith(".SLF")) {
			return false;
		}
		return true;
	}

}
