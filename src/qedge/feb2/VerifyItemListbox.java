package qedge.feb2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItemListbox {

	public static void main(String[] args) throws Throwable {
		// to verify expected item in a list box is equals to actual item
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		String expecteditem = "baby";
		boolean itemexist = false;
		//store the list box into select class object
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in the list box
		List<WebElement> olist = dropdown.getOptions();
		//print size of list in listbox
		System.out.println("no of item are::" + olist.size());
		Thread.sleep(5000);
		for(WebElement each : olist)
		{
			String actualitems = each.getText();
			System.out.println(actualitems);
			Thread.sleep(5000);
			if(expecteditem.equalsIgnoreCase(actualitems))
			{
				itemexist = true;
				break;
			}
			if(itemexist)
			{
				System.out.println("item found in listbox::"+ expecteditem);
			}
			else
			{
				System.out.println("item not found in listbox::"+ expecteditem);
			}
			

				
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
