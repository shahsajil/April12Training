package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class ProductDirectoryPage extends PageObjectBase{

	public ProductDirectoryPage(WebDriver driver) {
		super(driver);

	}
	public AmpegProSeries clickSVTPROSERIESBassHeadsProduct() {
		WebElement element = this.getDriver().findElement(By.xpath("//img[@alt='SVT Pro Series: Bass heads']"));
		element.click();
		return new AmpegProSeries(this.getDriver());
	}

	public AmpegClassicSeriesPage clickClassicSeriesBassHeadsAndEnclosuresProduct() {
		WebElement element = this.getDriver().findElement(By.xpath("//img[@alt='Classic Series: Bass heads & enclosures']"));
		element.click();
		return new AmpegClassicSeriesPage(this.getDriver()) ;
	}

}
