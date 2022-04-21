package qedge.feb2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//print any specific row and cell data
		String tabletext1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]")).getText();
		String tabletext2 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]")).getText();
		String tabletext3 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
		System.out.println(tabletext1 + "  \t " + tabletext2+" \t   "+ tabletext3);
		driver.close();
		

	}

}
