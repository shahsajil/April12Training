import org.openqa.selenium.WebElement;

public class HyperlinkControlExtension {

	private WebElement wrappedElement;

	public HyperlinkControlExtension(WebElement element) {
		this.wrappedElement = element;

	}

	public void selectLink() {
		this.wrappedElement.click();

	}

	public String getLinkText() {
		return this.wrappedElement.getText();

	}

}
