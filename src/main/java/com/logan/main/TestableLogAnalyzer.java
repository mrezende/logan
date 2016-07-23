package com.logan.main;

/**
 * Created by marceloderezendemartins on 7/23/16.
 */
public class TestableLogAnalyzer extends LogAnalyzerUsingFactoryMethod {

    private ExtensionManager manager;

    public TestableLogAnalyzer(ExtensionManager manager) {
        this.manager = manager;
    }

    @Override
    public ExtensionManager getExtensionManager() {
        return manager;
    }
}
