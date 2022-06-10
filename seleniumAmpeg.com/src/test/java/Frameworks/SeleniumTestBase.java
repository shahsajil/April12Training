package Frameworks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class SeleniumTestBase {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		String browserType = "firefox";
		String path = "";

		if(browserType.contains("chrome")) {
			path ="src\\test\\resources\\chromedriver.exe"; 
			System.setProperty("webdriver.chrome.driver", path);
			this.driver = new ChromeDriver();
		}
		else if(browserType.contains("firefox")) {
			path ="src\\test\\resources\\geckodriver.exe"; 
			System.setProperty("webdriver.gecko.driver", path);
			this.driver = new FirefoxDriver();
		}

		SetOptions();
	}

	private void SetOptions() {
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void quit() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}
	}

	protected WebDriver getDriver() {
		return this.driver;
	}
}