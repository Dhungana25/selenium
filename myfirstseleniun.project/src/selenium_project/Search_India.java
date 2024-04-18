package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_India {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("btnK")).click();
	//driver.manage().window().maximize();
	}

}
