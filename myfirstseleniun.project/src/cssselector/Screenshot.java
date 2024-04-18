package cssselector;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
//Assignments124
public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement dropdown= driver.findElement(By.xpath("(//select[@id='Choice1'])[1]"));
		Select choice1 = new Select(dropdown);
		choice1.selectByVisibleText("Demo4");
		TakesScreenshot tss= driver;
	File source= 	tss.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\Screenshots\\One"+Math.random()+".png");
	//File destination= new File("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\Screenshots\\One"+new  Screenshot().getClass() +".png");
	//File destination= new File("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\Screenshots\\One"+Date d1()=new Date(d1.getTime()) +".png");
	
	FileHandler.copy(source, destination);	
		
	
	}

}
