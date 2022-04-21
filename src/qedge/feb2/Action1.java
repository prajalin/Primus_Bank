package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		// create object for Actions class
		Actions ac = new Actions(driver);
		//click esc key in keyboard
		ac.sendKeys(Keys.ESCAPE).perform();
		// mouse to Fashions
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		//mouse to all and click
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='All']"))).click().perform();
		Thread.sleep(5000);
		//mouse to baby and kids
		ac.moveToElement(driver.findElement(By.xpath("(//div[@class='_1kidPb'])[1]"))).perform();
		Thread.sleep(5000);
		//mouse to puzzles
		ac.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[11]"))).click().build().perform();
		Thread.sleep(5000);
		//mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"))).perform();
		Thread.sleep(5000);
		//mouse to apple and click
		ac.moveToElement(driver.findElement(By.xpath("//a[@title='Apple']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
		
		
		}

}
