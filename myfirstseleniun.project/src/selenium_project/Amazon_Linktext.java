package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Linktext {

	public static void main(String[] args) {
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
   driver.findElement(By.linkText("Mobiles")).click();
   
	}

}
