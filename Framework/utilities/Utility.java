package utilities;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import testUtilities.Constants;

public class Utility extends TestBase{

	public static void waiting() 
	{
		driver.manage().timeouts().implicitlyWait(Constants.WAIT_TIME, TimeUnit.SECONDS);
	}
	
	public static String StringRandom (int Number) {
		String Line = "";
		Random r = new Random();
	    String alphabet = "qwertyuiopasdfghjklzxcvbnm";
	    for (int i = 0; i < Number; i++){
	        Line = Line + (alphabet.charAt(r.nextInt(alphabet.length())));}
	    return Line;
	}
	
	//need to improve 
	public static String NumberRandom (int Number) {
		String Line = "";
		Random r = new Random();
	    String alphabet = "0123456789";
	    for (int i = 0; i < Number; i++){
	        Line = Line + (alphabet.charAt(r.nextInt(alphabet.length())));}
	    return Line;
	}
	
}
