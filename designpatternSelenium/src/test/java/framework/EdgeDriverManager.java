package framework;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager{

	@Override
	public void createDriver() {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\msedgedriver.exe");
		this.setDriver(new EdgeDriver());
	}

}
