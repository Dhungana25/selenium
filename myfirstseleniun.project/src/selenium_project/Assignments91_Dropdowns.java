package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments91_Dropdowns {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Dropdown= driver.findElement(By.xpath("(//select)[1]"));
		Select s1=new Select(Dropdown);
		s1.selectByVisibleText("Books");
		WebElement search_tf= driver.findElement(By.id("twotabsearchtextbox"));
		
		search_tf.sendKeys("World");
		search_tf.sendKeys(Keys.ENTER);
		WebElement First_book= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
		First_book.click();

	}

}
