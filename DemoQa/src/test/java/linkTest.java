import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import framework.SeleniumTestBase;

public class linkTest extends SeleniumTestBase {
  @Test
  public void canClickLink() {
	  
	  String linkText = "Link has responded with staus 201 and status text Created";
	  
	  String getLinkText = new LinkTextPage(this.getDriver())
			  .navigate()
			  .canClickCreatedLink()
			  .getLinkMessage();
	  
	  assertEquals(getLinkText, linkText, "The link text should match the above text");
	  
  }
}
