package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments97 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchtf= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		if(searchtf.isDisplayed()==true && searchtf.isEnabled()==false)  //if we will write true it will type india.an if we will give || or operator it will type india.
		{
			searchtf.sendKeys("india");
			
		}
				

	}

}
