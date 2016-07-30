package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/30/16.
 */
public class FakeWebService implements WebService {
    String lastError;
    @Override
    public void logError(String message) {
        this.lastError = message;
    }

    public String getLastError() {
        return lastError;
    }
}
