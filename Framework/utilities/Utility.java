package utilities;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testUtilities.Constants;

public class Utility extends TestBase{

	static WebElement element = null;
	public static void waiting() 
	{
		driver.manage().timeouts().implicitlyWait(Constants.WAIT_TIME, TimeUnit.SECONDS);
	}

	public static WebElement searchForText (String Text)
	{
		element = driver.findElement(By.xpath("//*[contains(text(), '"+ Text +"')]"));
		return element; 
	}	
	
	public static String stringRandom (int Number) {
		String Line = "";
		Random r = new Random();
	    String alphabet = "qwertyuiopasdfghjklzxcvbnm";
	    for (int i = 0; i < Number; i++){
	        Line = Line + (alphabet.charAt(r.nextInt(alphabet.length())));}
	    return Line;
	}

	//need to improve 
	public static String numberRandom (int Number) {
		String Line = "";
		Random r = new Random();
	    String alphabet = "0123456789";
	    for (int i = 0; i < Number; i++){
	        Line = Line + (alphabet.charAt(r.nextInt(alphabet.length())));}
	    return Line;
	}
	
}
