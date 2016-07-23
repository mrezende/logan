package com.logan.main;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LogAnalyzerTests {

	private static LogAnalyzer makeAnalyzer() {
		return new LogAnalyzer();
	}

	@Test
	public void isValidLogFilename_BadExtension_ReturnsFalse() {
		LogAnalyzer logAnalyzer = makeAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename("filewithbadextension.foo");
		Assert.assertFalse(isValid);
	}

	@Test
	@Parameters({"filewithgoodextension.SLF", "filewithgoodextension.slf"})
	public void isValidLogFilename_ValidExtensions_ReturnsTrue(String filename) {
		LogAnalyzer logAnalyzer = makeAnalyzer();
		boolean isValid = logAnalyzer.isValidLogFilename(filename);

		Assert.assertTrue(isValid);
	}

	@Test(expected = IllegalArgumentException.class)
	public void isValidLogFilename_EmptyFilename_ThrowsException() {
		LogAnalyzer logAnalyzer = makeAnalyzer();
		logAnalyzer.isValidLogFilename("");


	}

	@Test
	@Parameters({ "badname.foo, false", "goodname.slf, true"})
	public void isValidLogFilename_WhenCalled_ChangeWasLastFilenameValid(String filename, boolean expected) {
		LogAnalyzer logAnalyzer = makeAnalyzer();
		boolean validLogFilename = logAnalyzer.isValidLogFilename(filename);

		Assert.assertEquals(expected, logAnalyzer.isLastFilenameValid());

	}

}
