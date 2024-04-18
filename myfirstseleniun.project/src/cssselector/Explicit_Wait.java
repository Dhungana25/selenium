package cssselector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https:www.google.com");
	driver.manage().window().maximize();
	WebElement search_tf= driver.findElement(By.name("q"));
	WebDriverWait w1= new WebDriverWait(driver,Duration.ofSeconds(10));
	//w1.until(ExpectedConditions.titleIs("Sarmila")); //it will give timeout exception
	//w1.until(ExpectedConditions.titleIs("Google"));
	w1.until(ExpectedConditions.titleContains("Goo"));  //it can be utilized for bigger title page
	w1.until(ExpectedConditions.alertIsPresent());
	search_tf.sendKeys("india");
	search_tf.sendKeys(Keys.ENTER);
	
	

	}

}
