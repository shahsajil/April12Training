package framework;

public class DriverManagerFactory {

	public static DriverManager getManager(String browserType) {

		if(browserType.equals("chrome")){
			return new ChromeDriverManager();
		}
		if(browserType.equals("edge")){
			return new EdgeDriverManager();
		}

		throw new RuntimeException(browserType + " is not a supported  browser");

	}
}
