package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_loginassign {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sarmila.mehta73@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Help@234");
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
