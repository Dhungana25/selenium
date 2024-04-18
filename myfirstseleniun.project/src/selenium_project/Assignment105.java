package selenium_project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//very important//Launch google.com > right click on Gmail.
//After right click, select option “open link in incognito window”
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment105 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(ele).perform();
		Thread.sleep(2000);
   Robot r1=new Robot();
   r1.keyPress(KeyEvent.VK_DOWN);
   r1.keyPress(KeyEvent.VK_DOWN);
   r1.keyPress(KeyEvent.VK_DOWN);
   Thread.sleep(2000);
   r1.keyPress(KeyEvent.VK_ENTER);
   
   
	}

}
