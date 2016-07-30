package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public class LogAnalyzer2 {

    private WebService webService;
    private EmailService emailService;

    public LogAnalyzer2(WebService webService, EmailService emailService) {
        this.webService = webService;
        this.emailService = emailService;
    }

    public EmailService getEmailService() {
        return emailService;
    }

    public WebService getWebService() {
        return webService;
    }

    public void analyze(String filename) {
        if(filename.length() < 8) {
            try {
                webService.logError("Filename too short:" + filename);
            } catch (Exception e) {
                emailService.sendEmail("someone@somewhere.com", "can't log", e.getMessage());
            }
        }
    }
}
