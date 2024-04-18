package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments89 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//span[.='Mobiles'])[2]")).click();
		driver.findElement(By.xpath("//span[.='✕']"));
		

	}

}
