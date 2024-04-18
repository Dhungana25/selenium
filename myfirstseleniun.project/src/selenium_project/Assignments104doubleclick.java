package selenium_project;
//How to double click on drag and drop.
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments104doubleclick {
  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://grotechminds.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement courses= driver.findElement(By.linkText("Courses"));
	courses.click();
	WebElement job= driver.findElement(By.xpath("(//a[@class='elementor-item'])[6]"));
	job.click();
	Actions a1=new Actions(driver);
	Thread.sleep(2000);
	a1.doubleClick(job).perform();
}
}
