package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) throws Throwable {
		//create instance object for accessing WebDriver methods
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("qedge");
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("5677779990");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.name("confirm")).sendKeys("Test@12345");
		//check checkbox on
		Thread.sleep(5000);
		driver.findElement(By.name("agree")).click();
		//click on continue button
		driver.findElement(By.className("btn btn-primary")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
