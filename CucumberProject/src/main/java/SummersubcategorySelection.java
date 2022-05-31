import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SummersubcategorySelection {
	WebDriver driver;

	@Given("WebBrowser is open")
	public void WebBrowser_is_open() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
	} 

	@And("navigate to the URL")
	public void navigate_to_the_URL() {
		driver.navigate().to("https://invenauto.tech/index.php");
	}
	
	@When("user select dresses keyword in homepage")
	public void user_select_dresses_keyword_in_homepage() {
		driver.findElement(By.cssSelector("li[class='sfHoverForce sfHover'] a[title='Dresses']")).click();
	}

	@And("Select the Summer Dresses in subcategory")
	public void select_the_Summer_Dresses_in_subcategory() {
		driver.findElement(By.xpath("//img[@alt='Summer Dresses']")).click();
	}

	@Then("User should able to see the Summer Dresses in a page title")
	public void user_should_able_to_see_the_Summer_Dresses_in_a_page_title() {
		driver.getTitle();
		driver.quit();
	}



}
