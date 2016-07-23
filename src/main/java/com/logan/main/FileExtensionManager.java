package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/23/16.
 */
public class FileExtensionManager implements ExtensionManager {

    public boolean isValid(String filename) {
        if(filename == null || filename.trim() == "") {
            throw new IllegalArgumentException("filename has to be provided");
        }

        if (!filename.toUpperCase().endsWith(".SLF")) {
            return false;
        }

        return true;
    }
}
