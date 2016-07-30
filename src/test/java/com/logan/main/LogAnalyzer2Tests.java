package com.logan.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public class LogAnalyzer2Tests {

    @Test
    public void analyze_WebServiceThrows_SendsEmail() {

        FakeWebService stubService = new FakeWebService();
        Exception exception = new Exception("fake exception");
        stubService.setToThrow(exception);

        FakeEmailService mockService = new FakeEmailService();

        LogAnalyzer2 log = new LogAnalyzer2(stubService, mockService);
        String tooShortFilename = "abc.txt";

        log.analyze(tooShortFilename);

        Assert.assertTrue("someone@somewhere.com".contains(mockService.getTo()));
        Assert.assertTrue("can't log".contains(mockService.getSubject()));
        Assert.assertTrue("fake exception".contains(mockService.getBody()));


    }

}
