package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws Throwable {
		// verify login functionality
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedge.com/");
		Thread.sleep(5000);
		//store username text box into WebElement to access more than one WebElement methods
		WebElement username = driver.findElement(By.name("txtusername"));
		username.clear();
		username.sendKeys("Admin23");
		Thread.sleep(5000);
		//store password text box into WebElement to access more than one WebElement methods
		WebElement password = driver.findElement(By.name("txtpassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).submit();
		Thread.sleep(5000);
		//to verify whether the URL contains the expected characters 
		String expected = "dashboard";
		String actual = driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("login successful::"+ expected + actual);
		}
		else
		{
			String errormessage = driver.findElement(By.id("spanmessage")).getText();
			System.out.println("login failed::"+ errormessage + expected + actual);
		}
		driver.close();

	}

}
