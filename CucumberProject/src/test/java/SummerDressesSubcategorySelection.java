import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SummerDressesSubcategorySelection {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
	} 
  
	

	@Given("navigate to the website URL")
	public void navigate_to_the_website_URL() {
		driver.navigate().to("https://invenauto.tech/index.php");
	}

	@When("user entet dresses keyword in search field")
	public void user_entet_dresses_keyword_in_search_field() {
		driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
	}

	@When("Click search icon")
	public void click_search_icon() {
		driver.findElement(By.name("submit_search")).click(); 
	}

	@When("click Summer Dresses subcategory")
	public void click_Summer_Dresses_subcategory() {
		driver.findElement(By.xpath("//img[@alt='Summer Dresses']")).click();
	    
	}

	@Then("User should able to see the Summer Dresses in Title")
	public void user_should_able_to_see_the_Summer_Dresses_in_Title() {
	   driver.getTitle();
	   driver.quit();
	}
}
