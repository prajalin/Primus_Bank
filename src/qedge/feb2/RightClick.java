package qedge.feb2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		// right click on gmail
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		//create object for Robot class for accessing window related
		Robot r = new Robot();
		//press down arrow for 2 times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click enter button 
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to child window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		//switch to parent window
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		}

}
