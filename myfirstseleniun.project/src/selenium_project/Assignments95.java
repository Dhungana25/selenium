package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//how to handle the file upload popup.
public class Assignments95 {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	 WebElement upload= driver.findElement(By.id("file"));
	 upload.sendKeys("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\src\\selenium_project");

	}

}
