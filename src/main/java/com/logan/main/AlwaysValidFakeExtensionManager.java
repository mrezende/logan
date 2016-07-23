package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/23/16.
 */
public class AlwaysValidFakeExtensionManager implements ExtensionManager {

    @Override
    public boolean isValid(String filename) {
        return true;
    }
}
