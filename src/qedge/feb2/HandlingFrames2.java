package qedge.feb2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames);
		System.out.println("no of frames are ::"+ frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		//create object for Actions class
		Actions ac = new Actions(driver);
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
		driver.quit();
		
		

	}

}
