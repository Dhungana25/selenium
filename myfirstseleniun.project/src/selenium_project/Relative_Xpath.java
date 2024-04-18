package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/sarmi/Downloads/learningHTML1by%20manishsir.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a")).click();
	

	}

}
