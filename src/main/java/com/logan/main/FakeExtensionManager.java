package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/23/16.
 */
public class FakeExtensionManager implements ExtensionManager{

    private boolean valid;

    @Override
    public boolean isValid(String filename) {
        return valid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

}
