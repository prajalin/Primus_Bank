package qedge.feb2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		//store table into web element
		WebElement webtable = driver.findElement(By.id("customers"));
		//get collection of rows in a table which are stored in tr tag
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		System.out.println("no of rows::"+ rows.size());
		Thread.sleep(3000);
		//iterate all rows
		for(WebElement eachrow : rows)
		{
			//get collection of columns from each row which are stored in td tag
			List<WebElement> columns = eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for(WebElement eachcell : columns)
			{
				String celltext = eachcell.getText();
				System.out.println(celltext + "/t");
			}
			
		}
		System.out.println();
		

	}

}
