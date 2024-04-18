package selenium_project;
//assignment 88
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpathamazon {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	driver.findElement(By.xpath("//a[.='Mobiles']")).click();
			

	}

}
