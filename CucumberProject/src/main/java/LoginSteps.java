import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {

	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open"); 
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe" );

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}
	@And("user click in signin tab")
	public void user_click_in_signin_tab() {
		System.out.println("Inside Step - user clickin signin tab");
		driver.navigate().to("https://invenauto.tech/index.php");

	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");

		driver.findElement(By.id("email")).sendKeys("user11@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("user11");

	}

	@And("click signin button")
	public void click_signin_button() {
		System.out.println("Inside Step - click signin button");
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("user is navigated to the myaccount page")
	public void user_is_navigated_to_the_myaccount_page() {
		System.out.println("Inside Step - user is navigated to the myaccount page");
		driver.getCurrentUrl();
		driver.quit();
	}



}
