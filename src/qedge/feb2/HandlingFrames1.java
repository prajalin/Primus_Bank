package qedge.feb2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(4000);
		//get collection of frames
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+ frames.size());
		//switch to frame
		driver.switchTo().frame(0);
		String frametext = driver.findElement(By.xpath("//body//p")).getText();
		System.out.println(frametext);
		Thread.sleep(5000);
		//write some text in frame
		driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")).sendKeys("hello guys");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")).sendKeys("handling frames");
		Thread.sleep(4000);
		driver.close();
		
		
		}

}
