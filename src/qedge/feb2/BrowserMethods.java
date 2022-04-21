package qedge.feb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {

	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//create instance object
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","c:\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		//create instance object
		//WebDriver driver = new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url in browser
		driver.get("https://www.naukri.com");
        //suspend tool for 5 sec
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
	
		
		
		

	}

}
