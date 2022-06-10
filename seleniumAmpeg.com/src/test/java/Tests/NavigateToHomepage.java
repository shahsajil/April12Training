package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Frameworks.SeleniumTestBase;
import Pages.HomePage;

public class NavigateToHomepage extends SeleniumTestBase {
	
	@Test
	public void canEasilyNavigateToTheHomePageFromTheProductDetailsPage() {
		String actualUrl = "https://ampeg.com/index.html";

		String currentURL = new HomePage(this.getDriver())
				.navigate()
				.clickProduct()
				.clickSVTPROSERIESBassHeadsProduct()
				.clickSVT3PROProduct()
				.clickHomeTab()
				.getCurrentUrl();

		Assert.assertEquals(currentURL,actualUrl,"User should navigate to the homepage URl");
	}
}
