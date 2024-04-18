package cssselector;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

//Assignments120
public class Count_Numberofoption {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown= driver.findElement(By.xpath("(//select)[1]"));
	Select s1= new Select(dropdown);
	List<WebElement> l1= s1.getOptions();
	int count= l1.size();
	System.out.println(count);
	TakesScreenshot tss= driver;
	File source= 	tss.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\Screenshots\\One.png");
	FileHandler.copy(source, destination);	
	
	
		
	}

}
