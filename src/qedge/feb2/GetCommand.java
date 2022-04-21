package qedge.feb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {

	public static void main(String[] args) throws Throwable {
		// script to return pagetitle,current url and their lengths
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		Thread.sleep(5000);
		//get title and length of title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//get URL and length of URL
		String strurl = driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.close();
		

	}

}
