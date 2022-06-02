package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class AmpegClassicSeriesSVT410HLFProductPage extends PageObjectBase {

	public AmpegClassicSeriesSVT410HLFProductPage(WebDriver driver) {
		super(driver);	
	}

	public String getArtistName() {
		WebElement element = this.getDriver().findElement(By.xpath("//div[@id='artist']//descendant::b"));
		return element.getText();
	}
}
