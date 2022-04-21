package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		int x = dst.getLocation().getX();
		int y = dst.getLocation().getY();
		System.out.println(x + "    "+ y);
		ac.dragAndDropBy(src, x, y).build().perform();
		driver.close();

	}

}
