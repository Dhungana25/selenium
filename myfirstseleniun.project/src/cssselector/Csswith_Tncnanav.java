package cssselector;
//Assignments112
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csswith_Tncnanav {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search_tf= driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		search_tf.sendKeys("dubai");
		search_tf.sendKeys(Keys.ENTER);
		
		
	}

}
