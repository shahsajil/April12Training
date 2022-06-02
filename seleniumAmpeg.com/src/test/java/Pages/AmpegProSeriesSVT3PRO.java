package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class AmpegProSeriesSVT3PRO extends PageObjectBase{


	public AmpegProSeriesSVT3PRO(WebDriver driver) {
		super(driver);
	}

	public PageObjectBase clickHomeTab() {
		WebElement element = this.getDriver().findElement(By.xpath("//div[@id='navLinks']//descendant::a"));
		element.click();
		return new HomePage(this.getDriver());
	}	

}
