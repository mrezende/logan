package com.logan.main;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;


public class LogAnalyzerTests {

	@Test
	public void isValidLogFilename_NameSupportedExtension_ReturnsTrue() {
		FakeExtensionManager manager = new FakeExtensionManager();
		manager.setValid(true);

		LogAnalyzer logAnalyzer = new LogAnalyzer(manager);
		boolean valid = logAnalyzer.isValidLogFilename("file.ext");

		Assert.assertTrue(valid);

	}

	@Test
	public void overrideTest() {
		FakeExtensionManager manager = new FakeExtensionManager();
		manager.setValid(true);

		TestableLogAnalyzer logAnalyzer = new TestableLogAnalyzer(manager);
		boolean valid = logAnalyzer.isValidLogFilename("file.txt");

		Assert.assertTrue(valid);
	}

}
