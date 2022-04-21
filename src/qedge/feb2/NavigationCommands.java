package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		String pagetitle1 = driver.getTitle();
		System.out.println("pagetitle[1]"+ pagetitle1);
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		String pagetitle2 = driver.getTitle();
		System.out.println("pagetitle[2]"+ pagetitle2);
		Thread.sleep(5000);
		//click back button to go to previous page
		driver.navigate().back();
		String pagetitle3 = driver.getTitle();
		System.out.println("pagetitle[3]"+ pagetitle3);
		Thread.sleep(5000);
		//click forward button to go to next page
		driver.navigate().forward();
		String pagetitle4 = driver.getTitle();
		System.out.println("pagetitle[4]"+ pagetitle4);
		Thread.sleep(5000);
		//refresh the page or reload the page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
