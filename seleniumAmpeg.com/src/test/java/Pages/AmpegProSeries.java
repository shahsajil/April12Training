package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class AmpegProSeries extends PageObjectBase{

	public AmpegProSeries(WebDriver driver) {
		super(driver);
	}

	public AmpegProSeriesSVT3PRO clickSVT3PROProduct() {
		WebElement element = this.getDriver().findElement(By.xpath("//img[@alt='SVT-3PRO']"));
		element.click();
		return new AmpegProSeriesSVT3PRO(this.getDriver());
	}

}
