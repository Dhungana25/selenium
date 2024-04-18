package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments98 {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://grotechminds.com/is-selected/");
	driver.manage().window().maximize();
	WebElement checkbox1= driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));
	boolean answer=checkbox1.isSelected();
	System.out.println(answer);
	if(answer==false)
	{
		checkbox1.click();
	}
	WebElement checkbox2= driver.findElement(By.xpath("(//input[@id='vehicle2'])[2]"));
	boolean answer1= checkbox2.isSelected();
	System.out.println(answer1);
	if(answer1==true)
	{
		checkbox2.click();
		
	}
	

	}

}
