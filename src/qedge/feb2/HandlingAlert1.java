package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http:primusbank.qedgetech.com/");
		Thread.sleep(3000);
		//click login button
		driver.findElement(By.id("login")).click();
		//get capture alert text
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		//click ok in alert box
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		}

}
