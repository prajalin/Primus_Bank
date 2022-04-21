package qedge.feb2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws Throwable {
		// script to verify expected title with actual title
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://google.com");
		//driver.get("https://gmali.com");
		Thread.sleep(5000);
		String expectedtitle = "google";
		String actualtitle = driver.getTitle();
		//verify expectedtitle with actualtitle
		if(expectedtitle.equalsIgnoreCase(actualtitle))
		{
			System.out.println("title is matching::"+expectedtitle+" "+actualtitle);
		}
		else
		{
			System.out.println("title is not matching::"+expectedtitle+"  "+actualtitle);
		}
		driver.quit();

	}

}
