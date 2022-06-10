import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {

		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user click in signin tab")
	public void user_click_in_signin_tab() {	
		driver.navigate().to("https://invenauto.tech/index.php");

	}

	@When("user is on login page")
	public void user_is_on_login_page() {	
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@When("user enters (.*)and (.*)$")
	public void user_enters_user11_gmail_com_and_user11(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@And("click signin button")
	public void click_signin_button() {	
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("user is navigated to the myaccount page")
	public void user_is_navigated_to_the_myaccount_page() {	
		driver.getCurrentUrl();
		driver.quit();
	}

}
