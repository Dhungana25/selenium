package selenium_project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Mintra_Exam {
  public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	WebElement search_tf= driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	search_tf.sendKeys("shoe");
	
	List<WebElement>  auto= driver.findElements(By.xpath("//li[.='Shoes For Women']"));
	int count= auto.size();
		auto.get(count).click();
	WebElement  tenthshoe= driver.findElement(By.xpath("(//img[@class='img-responsive'])[10]"));
	tenthshoe.click();
	  WebElement addtobag= driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
	  addtobag.click();
	  WebElement size=driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[2]"));
	  size.click();
	  WebElement bag= driver.findElement(By.xpath("//span[.='Bag']"));
	  bag.click();
	  WebElement placeorder= driver.findElement(By.xpath("(//div[.='PLACE ORDER'])[1]"));
	  TakesScreenshot tss= driver;
		File source= 	tss.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\Screenshots\\One"+Math.random()+".png");
	  FileHandler.copy(source, destination);
	  
}
}
