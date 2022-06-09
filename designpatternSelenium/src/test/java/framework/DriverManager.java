package framework;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager{
	private WebDriver driver;

	public abstract void createDriver();

	public WebDriver getDriver() {
		return this.driver;

	}
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void quitDriver() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}

	}
}
