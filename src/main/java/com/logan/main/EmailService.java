package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public interface EmailService {

    void sendEmail(String to, String subject, String body);

}
