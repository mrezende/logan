package com.logan.main;

public class LogAnalyzer {

	private ExtensionManager manager;
	private WebService webService;


	public LogAnalyzer(ExtensionManager manager) {
		this.manager = manager;
	}

	public LogAnalyzer(WebService webService) {
		this.webService = webService;
	}

	public boolean isValidLogFilename(String filename) {

		return manager.isValid(filename);

	}

	public void analyze(String filename) {
		if(filename.length() < 8) {
			this.webService.logError("Filename too short:" + filename);
		}
	}



}
