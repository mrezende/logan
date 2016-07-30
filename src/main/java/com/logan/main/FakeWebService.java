package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public class FakeWebService implements WebService {
    private Exception toThrow;

    @Override
    public void logError(String message) throws Exception {
        if(toThrow != null) {
            throw toThrow;
        }
    }

    public void setToThrow(Exception toThrow) {
        this.toThrow = toThrow;
    }
}
