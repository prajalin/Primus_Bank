package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathExample {

	public static void main(String[] args) throws Throwable {
		// writing xpath of complete facebook account creation form
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@name='reg']//following::input[2]")).sendKeys("testing");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[3]")).sendKeys("selenium");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[4]")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[5]")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[6]")).sendKeys("test@1234");
		Thread.sleep(5000);
		Select daylistbox = new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[1]")));
		daylistbox.selectByIndex(10);
		Select monthlistbox = new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[2]")));
		monthlistbox.selectByVisibleText("mar");
		Select yearlistbox = new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[3]")));
		yearlistbox.selectByVisibleText("1980");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[9]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).submit();
		driver.close();
		}

}
