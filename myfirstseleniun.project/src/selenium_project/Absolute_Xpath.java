package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/sarmi/Downloads/learningHTML1by%20manishsir.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Sarmila Dhungana");
	driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Ball@231");
	driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
	

	}

}
