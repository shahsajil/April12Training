package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Frameworks.PageObjectBase;

public class HomePage extends PageObjectBase {

	private static final String URL = "https://ampeg.com/";
	public HomePage(WebDriver driver) {
		super(driver);		
	}

	public HomePage navigate() {
		this.getDriver().navigate().to(URL);

		return this;
	}

	public ProductDirectoryPage clickProduct() {
		WebElement element = this.getDriver().findElement(By.xpath("//a[@class='main-item products']"));
		element.click();
		return new ProductDirectoryPage(this.getDriver());
	}

}
