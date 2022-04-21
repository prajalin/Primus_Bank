package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(4000);
		//enter usename and password.then click login
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);
		//click branches
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		//it takes to branch details page. click delete button
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		//capture the alert message
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(3000);
		//click cancel button in alert box
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		//click delete button 
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		//click ok button in alert box
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		//capture the alert message and then print
		String alertmessage2 = driver.switchTo().alert().getText();
		System.out.println(alertmessage2);
		Thread.sleep(4000);
		//click ok in alert box
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
