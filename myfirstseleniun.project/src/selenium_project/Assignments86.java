package selenium_project;
//Assignments 90
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments86 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement searchtx=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchtx.sendKeys("shoes");
		WebElement searchbutton= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
		
	WebElement firstshoe=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		firstshoe.click();
		


	}

}
//(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]