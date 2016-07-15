package com.logan.main;

import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerTests {
	@Test
	public void isValidLogFilename_BadExtension_ReturnsFalse() {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename("filewithbadextension.foo");
		Assert.assertFalse(isValid);
	}

	@Test
	public void isValidLogFilename_GoodExtensionLowerCase_ReturnsTrue() {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename("filewithgoodextension.slf");
		Assert.assertTrue(isValid);
	}

	@Test
	public void isValidLogFilename_GoodExtensionUpperCase_ReturnsTrue() {
		LogAnalyzer logAnalyzer = new LogAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename("filewithgoodextension.SLF");
		Assert.assertTrue(isValid);
	}

}
