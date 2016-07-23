package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/23/16.
 */
public class LogAnalyzerUsingFactoryMethod {

    public boolean isValidLogFilename(String filename) {

        return getExtensionManager().isValid(filename);

    }

    public ExtensionManager getExtensionManager() {

        return new FileExtensionManager();

    }

}
