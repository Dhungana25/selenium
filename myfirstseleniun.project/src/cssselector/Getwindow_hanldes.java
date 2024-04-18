package cssselector;
import java.util.Iterator;
//Assignments117
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow_hanldes {
  public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	driver.manage().window().maximize();
	  WebElement google_link= driver.findElement(By.xpath("//span[.='Google']"));
	  google_link.click();
	Set<String> s1=  driver.getWindowHandles();
	  System.out.println(s1);
	 // driver.quit();
	  Thread.sleep(2000);
	  Iterator<String> s2= s1.iterator();
	String a1=  s2.next();  //1st time parent id
	String a2=  s2.next();  //2nd time child id
	  driver.switchTo().window(a2);
	  driver.close();
	  
	  
	  
}
}
