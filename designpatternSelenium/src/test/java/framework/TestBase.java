package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
	private WebDriver driver; 
	
	
	@BeforeMethod
	public void setup() {
		
		String browserType = "edge";	
		DriverManager manager = DriverManagerFactory.getManager(browserType);
		manager.createDriver();
		this.driver = manager.getDriver();
		
		SetOptions();
	}
	
	@AfterMethod
	public void quit() {
		if (this.driver!= null) {
			this.driver.quit();
		}
	}
	protected WebDriver getDriver() {
		return this.driver;
	}
	private void SetOptions() {
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}
