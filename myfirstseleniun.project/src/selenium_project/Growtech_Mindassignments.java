package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Growtech_Mindassignments {

	public static void main(String[] args){
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	WebElement tf1= driver.findElement(By.xpath("//input[@id='fname']"));
	tf1.sendKeys("Sarmila");
	WebElement tf2= driver.findElement(By.xpath("//input[@id='lname']"));
	tf2.sendKeys("Dhungana");
	
	WebElement tf=driver.findElement(By.id("email"));
	tf.sendKeys("sarmila.mehta73@gmail.com");
	
	WebElement ptf= driver.findElement(By.id("password"));
	ptf.sendKeys("Apple@456");
	
	driver.findElement(By.id("Female")).click();
	
	WebElement dropdown= driver.findElement(By.xpath("(//select)[6]")); 
	Select s1=new Select(dropdown);
	s1.selectByIndex(1);
	WebElement dropdown4= driver.findElement(By.xpath("//select[@id='technicalskills']"));
	Select s4= new Select(dropdown4);
	s4.selectByVisibleText("Manual Testing");
	
	WebElement dropdown3= driver.findElement(By.xpath("//select[@id='Country']"));
	Select s3=new Select(dropdown3);
	s3.selectByVisibleText("Nepal");
	
	WebElement dropdown1 = driver.findElement(By.xpath("(//select[@id='Relegion'])"));
	Select s2= new Select(dropdown1);
	s2.selectByVisibleText("Hindu");
	
	WebElement tf3 = driver.findElement(By.id("Present-Address"));
	
	tf3.sendKeys("4567 colonial pkwy cedar park Tx");
	
	WebElement tf4= driver.findElement(By.id("Permanent-Address"));
	tf4.sendKeys("2345 highway road hutto Tx");
	
	WebElement tf5= driver.findElement(By.name("Pincode"));
	tf5.sendKeys("56478");
	driver.findElement(By.id("chat-bot-message-close")).click();
	
	 WebElement upload= driver.findElement(By.id("file"));
	 upload.sendKeys("C:\\Users\\sarmi\\OneDrive\\Desktop\\JavaPro\\myfirstseleniun.project\\src\\selenium_project");

	WebElement checkbox= driver.findElement(By.xpath("//input[@class='relocate form-check-input']"));
	checkbox.click();
	
	WebElement submitbutton= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	submitbutton.click();
	
	}

}
