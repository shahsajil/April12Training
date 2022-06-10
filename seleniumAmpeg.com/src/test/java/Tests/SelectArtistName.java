package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Frameworks.SeleniumTestBase;
import Pages.HomePage;

public class SelectArtistName extends SeleniumTestBase {

	@Test
	public void selectArtistNameWhoEndorsesSVT410HLF() {
		String expectedArtistName = "Bootsy Collins";

		String actualArtistName = new HomePage(this.getDriver())
				.navigate()
				.clickProduct()
				.clickClassicSeriesBassHeadsAndEnclosuresProduct()
				.clickSVT410HLFProduct()
				.getArtistName();

		Assert.assertEquals(actualArtistName, expectedArtistName,"The name of the artist is Bootsy Collins");

	}
}
