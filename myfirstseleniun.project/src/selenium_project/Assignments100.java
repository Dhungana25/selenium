package selenium_project;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments100 {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");//other way of lunching browser 
	//driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().back();  //it will go to the empty browser
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
}
}
