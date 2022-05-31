import java.util.concurrent.TimeUnit;

public class SignInSteps {
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/shahs/git/April12Training/Car.com/src/test/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicityWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximaize();
	}

	@And("user is on signin page")
	public void user_is_on_signin_page() {
	    
	}

	@When("user enters emailid and password")
	public void user_enters_emailid_and_password() {
	    
	}

	@And("Click SignIn")
	public void click_sign_in() {
	    
	}

	@Then("User navigated to the myaccount Page")
	public void user_navigated_to_the_myaccount_page() {
	    
	}

}
