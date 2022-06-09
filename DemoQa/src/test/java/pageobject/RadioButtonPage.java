package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class RadioButtonPage extends PageObjectBase {

	private static final String URL = "https://demoqa.com/radio-button";

	@FindBy(xpath = "//label[@for='yesRadio']")
	private WebElement yesRadioBtn;

	@FindBy(xpath = "//span[@class='text-success']")
	private WebElement radioresponsetext;

	@FindBy(xpath = "//label[@for='impressiveRadio']")
	private WebElement impressiveRadiobtn;

	@FindBy(xpath = "//span[@class='text-success']")
	private WebElement impressiveradioresponse;
	
	@FindBy(xpath = "//label[@for='noRadio']")
	private WebElement noRadioBtn;

	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}

	public RadioButtonPage navigate() {
		this.getDriver().navigate().to(URL);
		return this;
	}

	public RadioButtonPage selectYesRadioButton() {
		RadioButtonControlExtension radioButtonControlExtension = new RadioButtonControlExtension(yesRadioBtn);
		radioButtonControlExtension.getSelected();

		return this;
	}

	public String getYesRadioButton() { 
		RadioButtonControlExtension radioButtonControlExtension = new RadioButtonControlExtension(radioresponsetext);

		return radioButtonControlExtension.getKeyword(); 
	}



	public RadioButtonPage clickImpressiveRadioButton() {
		RadioButtonControlExtension radioButtonControlExtension = new RadioButtonControlExtension(yesRadioBtn);
		radioButtonControlExtension.getSelected();

		return this;

	}

	public String getImpressiveSelectedKeyword() {
		RadioButtonControlExtension radioButtonControlExtension = new RadioButtonControlExtension(impressiveRadiobtn);

		return radioButtonControlExtension.getKeyword(); 
	}

	public RadioButtonPage clickNoRadioButton() {
		RadioButtonControlExtension radioButtonControlExtension = new RadioButtonControlExtension(noRadioBtn);
		radioButtonControlExtension.getSelected();

		return this;


	}

	
}
