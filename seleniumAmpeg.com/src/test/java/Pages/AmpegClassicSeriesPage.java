package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class AmpegClassicSeriesPage extends PageObjectBase {

	public AmpegClassicSeriesPage(WebDriver driver) {
		super(driver);	
	}

	public AmpegClassicSeriesSVT410HLFProductPage clickSVT410HLFProduct() {
		WebElement element = this.getDriver().findElement(By.cssSelector("img[src='images/SVT-410HLF_Thumb.jpg']"));
		element.click();

		return new AmpegClassicSeriesSVT410HLFProductPage(this.getDriver());
	}	
}
