import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.PageObjectBase;

public class LinkTextPage extends PageObjectBase {

	private static final String URL = "https://demoqa.com/links";

	@FindBy(xpath = "//a[@id='created']")
	private WebElement linkClickElement;

	@FindBy(xpath = "//p[@id='linkResponse']")
	private WebElement linktext;

	public LinkTextPage(WebDriver driver) {
		super(driver);

	}

	public LinkTextPage navigate() {
		this.getDriver().navigate().to(URL);

		return this;
	}

	public LinkTextPage canClickCreatedLink() {
		HyperlinkControlExtension hyperlinkControlExtension = new HyperlinkControlExtension(linkClickElement);
		hyperlinkControlExtension.selectLink();

		return this;
	}
	public String getLinkMessage() {
		HyperlinkControlExtension hyperlinkControlExtension = new HyperlinkControlExtension(linktext);

		return hyperlinkControlExtension.getLinkText();

	}
}
