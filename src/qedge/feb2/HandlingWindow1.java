package qedge.feb2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(3000);
		//print parent window id
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		//click terms,privacy,help links to open in different tabs
		driver.findElement(By.linkText("Terms")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		//get all window ids
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		Thread.sleep(3000);
		//iterate all windows
		for(String each : allwins)
		{
			if(!parent.equals(each))
			{
	
				driver.switchTo().window(each);
				String eachwindowtitle = driver.getTitle();
				System.out.println(eachwindowtitle);
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(4000);
		driver.quit();
		

	}
}