package utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {

	public static String Release;
	public static WebDriver driver = new FirefoxDriver();
	
	public void openUrl (String URL) 
	{
		driver.get(URL);
	}
	
	public void setRelease(String Release) {
		TestBase.Release = Release;
	}
	
	
	
}
