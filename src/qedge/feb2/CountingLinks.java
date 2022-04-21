package qedge.feb2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	public static void main(String[] args) throws Throwable {
		// To print a collection of hyper links in a webpage and print name of each and every link which are visible
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://rediff.com/");
		Thread.sleep(5000);
		//get collection of links in a webpage which are stored into html tag a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//print no of hyper links in the webpage
		System.out.println("no of links::"+ links.size());
		Thread.sleep(5000);
		//iterate each link
		for(WebElement each : links)
		{
		// print each link name
			String linkname = each.getText();
			System.out.println(linkname);
			
		}
		driver.close();
		
		

	}

}
