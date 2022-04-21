package qedge.feb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) throws Throwable {
		// verify URL is secured or unsecured
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedge.com/");
		Thread.sleep(5000);
		String expected = "http://";
		String actual = driver.getCurrentUrl();
		//verify URL starts with prefix text
		if(actual.startsWith(expected))
		{
			System.out.println("URL is secured::"+ actual + "  "+ expected);
			
		}
		else
		{
			System.out.println("URL is unsecured::" + actual +"  "+ expected);
		}
		driver.close();
	}

}
