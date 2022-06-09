import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class ResgistrationSteps{
	WebDriver driver = null;

	@Given("newbrowser is open")
	public void newbrowser_is_open() {

		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@When("user enter website url")
	public void user_enter_website_url() {
		driver.navigate().to("https://invenauto.tech/index.php");

	}
	@And("user click on signintab")
	public void user_click_on_signintab() {
		driver.findElement(By.xpath("//a[@class='login']")).click();

	}

	@When("user enter validnew (.*)$")
	public void user_enter_validnew(String emailaddress) {
		driver.findElement(By.id("email_create")).sendKeys(emailaddress);

	}

	@And("click create an account")
	public void click_create_an_account() {
		driver.findElement(By.name("SubmitCreate")).click();


	}

	@And("click title radio button Mr")
	public void click_title_radio_button_Mr() {
		driver.findElement(By.id("id_gender1")).click();

	}

	@And("Enter Personl information(.*),(.*)and (.*)$")
	public void enter_Personl_information_firstname_lastname_password_day_month_year(String firstname, String lastname, String password) {
		driver.findElement(By.id("customer_firstname")).sendKeys(firstname);
		driver.findElement(By.id("customer_lastname")).sendKeys(lastname);
		driver.findElement(By.id("passwd")).sendKeys(password);
	}

	@And("select day month year from dropdown option")
	public void select_day_month_year_from_dropdown_option() {
		driver.findElement(By.xpath("//select[@id='days']/option[16]")).click();
		driver.findElement(By.xpath("//select[@id='months']/option[13]")).click();
		driver.findElement(By.xpath("//select[@id='years']/option[35]")).click();
	}

	@And("Click Resgister tab")
	public void click_Resgister_tab() {
		driver.findElement(By.id("submitAccount")).click(); 
	}

	@Then("user should see the message like Your account has been created")
	public void user_should_see_the_message_like_Your_account_has_been_created() {
		driver.findElement(By.xpath("//p[@class = 'alert alert-success']")).getText();
		driver.quit();
	}

}