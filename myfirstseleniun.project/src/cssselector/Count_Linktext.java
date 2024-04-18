package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignments122
public class Count_Linktext {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> link_text= driver.findElements(By.tagName("a"));
		int countoflinktext= link_text.size();
		System.out.println(countoflinktext);
		for(int i=0;i<countoflinktext;i++)
		{
		WebElement single_link=	link_text.get(i);
		//String message= single_link.getText();
		String message= single_link.getAttribute("href");
		System.out.println(message);
	message.isEmpty();
		
		}		

	}

}
