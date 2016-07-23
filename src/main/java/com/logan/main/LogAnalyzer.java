package com.logan.main;

public class LogAnalyzer {

	private boolean lastFilenameValid;

	public boolean isValidLogFilename(String filename) {

		this.lastFilenameValid = false;
		if(filename == null || filename.trim() == "") {
			throw new IllegalArgumentException("filename has to be provided");
		}

		if (!filename.toUpperCase().endsWith(".SLF")) {
			return false;
		}

		this.lastFilenameValid = true;
		return true;
	}

	public boolean isLastFilenameValid() {
		return lastFilenameValid;
	}

	public void setLastFilenameValid(boolean lastFilenameValid) {
		this.lastFilenameValid = lastFilenameValid;
	}

}
