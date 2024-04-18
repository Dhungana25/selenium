package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocator {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/sarmi/Downloads/learningHTML1by%20manishsir.html");
	driver.manage().window().maximize();
	WebElement link= driver.findElement(By.tagName("a"));
	Thread.sleep(2000);
	link.click();
	
}
}
