package tests;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import framework.TestBase;

public class SanityTests extends TestBase{

	@Test
	
	public void canLaunchWebDriver() {
		assertNotNull(this.getDriver(), "the webdriver should be launch");
	}
}
