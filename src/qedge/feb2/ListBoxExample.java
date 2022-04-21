package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) throws Throwable {
		// to select items in a list boxes by using select class methods in facebook application
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		//store day,month and year list box into select class object
		Select daylist = new Select(driver.findElement(By.id("day")));
		Select monthlist = new Select(driver.findElement(By.id("month")));
		Select yearlist = new Select(driver.findElement(By.id("year")));
		//verify daylistbox is single or multiselection
		boolean value = daylist.isMultiple();
		System.out.println(value);
		//select a item from day list box
		daylist.selectByVisibleText("20");
		//select a item from month list box
		monthlist.selectByVisibleText("Dec");
		//select a item from year list box
		yearlist.selectByIndex(100);
		System.out.println(yearlist.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.close();
		

	}

}
