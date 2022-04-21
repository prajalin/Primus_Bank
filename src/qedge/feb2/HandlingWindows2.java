package qedge.feb2;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		//click ok button
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(5000);
		//click block on alert
		//driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		//click flights,hotels and buses
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
		Thread.sleep(5000);
		//store collection of all windows into ArrayList class
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		System.out.println(brw.size());
		Thread.sleep(5000);
		//switch to hotels window and verify title
		driver.switchTo().window(brw.get(2));
		String actual = driver.getTitle();
		String expected = "irctc hotels";
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("title is matching"+ actual + expected);
		}
		else
		{
			System.out.println("title is not matching"+ actual + expected);
		}
		Thread.sleep(5000);
		driver.close();
		//switch to flights window and click checkbox
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ltc']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		//switch to parent window
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		//enter data into text from box
		driver.findElement(By.xpath("(//input[@class='ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted'])[1]")).sendKeys("AGRA CANTT-AGC");
		Thread.sleep(5000);
		//enter data into to box
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[1]/div[2]/p-autocomplete[1]/span[1]/input[1]")).sendKeys("AJMER JN-AII");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		

	}

}
