package pageobject;

import org.openqa.selenium.WebElement;

public class RadioButtonControlExtension {

	private WebElement wrappedElement;

	public RadioButtonControlExtension(WebElement element) {
		this.wrappedElement = element;
	}

	public void getSelected() {
		this.wrappedElement.click();
	}

	public String getKeyword() {
		return this.wrappedElement.getText();
	}

}
