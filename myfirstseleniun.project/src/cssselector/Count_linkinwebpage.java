package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignments121
public class Count_linkinwebpage {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
	int countoflinks=	links.size();
		
		System.out.println(countoflinks);
		
	}

}
