import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;
import pageobject.RadioButtonPage;

public class RadioButtonTests extends SeleniumTestBase{
	@Test
	public void canClickYesRadioButton() {
		String Keyword = "Yes";
		
		String getYesKeyword = new RadioButtonPage(this.getDriver())
				.navigate()
				.selectYesRadioButton()
				.getYesRadioButton();
		
		assertEquals(getYesKeyword, Keyword); 
					
		
	}
	@Test
	public void canClickImpressiveRadioButton() {
		
		String Keyword = "Impressive";
		
		String getImpressiveKeyword = new RadioButtonPage(this.getDriver())
				.navigate()
				.clickImpressiveRadioButton()
				.getImpressiveSelectedKeyword();
		
		assertEquals(getImpressiveKeyword,Keyword);
				
				
	}

	@Test
	public void canClickNoRadioButton() {
		
		  new RadioButtonPage(this.getDriver())
				.navigate()
				.clickNoRadioButton();
	}
}
