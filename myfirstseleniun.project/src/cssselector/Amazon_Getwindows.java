package cssselector;
//Assignments118
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Getwindows {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search_tf= driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
		WebElement first_shoe= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		first_shoe.click();
		
		Set<String> pc= driver.getWindowHandles();
	Iterator<String>i1=	pc.iterator();
          String parent_window =	i1.next();

            String child_window = 	i1.next();
            driver.switchTo().window(child_window);
            /*Thread.sleep(2000);
            driver.close(); //child window will close*/
           WebElement add_tocart= driver.findElement(By.id("add-to-cart-button"));
           add_tocart.click();
           WebElement checkout= driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
           checkout.click();
		
	}

}
