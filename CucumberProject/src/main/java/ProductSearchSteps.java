import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductSearchSteps {

	WebDriver driver = null;

	@Given("website browser is open")
	public void website_browser_is_open() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
	} 

	@And("navigate to the website url")
	public void navigate_to_the_website_url() {
		driver.navigate().to("https://invenauto.tech/index.php");
	}
	@When("user enter product keyword in search field")
	public void user_enter_product_keyword_in_search_field() {
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
	}

	@And("click search icon")
	public void click_search_icon() {
		driver.findElement(By.name("submit_search")).click();
	}

	@Then("user is navigated to the Dresses Page")
	public void user_is_navigated_to_the_Dresses_Page() {
		driver.getCurrentUrl();
		driver.quit();

	}
}




