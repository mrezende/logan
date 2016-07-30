package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public class FakeEmailService implements EmailService {

    private String to;
    private String subject;
    private String body;

    public void sendEmail(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }
}
