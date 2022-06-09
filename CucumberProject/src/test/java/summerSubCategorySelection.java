import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class summerSubCategorySelection {
	WebDriver driver = null;

	@Given("WebBrowser is open")
	public void WebBrowser_is_open() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	} 

	@And("navigate to the Website URL")
	public void navigate_to_the_Website_URL() {
		driver.navigate().to("https://invenauto.tech/index.php");
	}

	@When("user select dresses tab in homepage")
	public void user_select_dresses_tab_in_homepage() {
		driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
	}

	@And("click Summer Dresses subcategory in dressesPage")
	public void click_Summer_Dresses_subcategory_in_dressesPage() {
		driver.findElement(By.xpath("//img[@alt='Summer Dresses']")).click();

	}

	@Then("user should able to see the Summer Dresses in pagetitle")
	public void user_should_able_to_see_the_Summer_Dresses_in_pagetitle() {
		driver.getTitle();
		driver.quit();

	}
}


