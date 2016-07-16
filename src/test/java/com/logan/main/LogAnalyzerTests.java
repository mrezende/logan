package com.logan.main;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LogAnalyzerTests {
	@Test
	public void isValidLogFilename_BadExtension_ReturnsFalse() {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename("filewithbadextension.foo");
		Assert.assertFalse(isValid);
	}

	@Test
	@Parameters({"filewithgoodextension.SLF", "filewithgoodextension.slf"})
	public void isValidLogFilename_ValidExtensions_ReturnsTrue(String filename) {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename(filename);

		Assert.assertTrue(isValid);
	}

}
