package selenium_project;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Title {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String title = driver.getTitle();
	System.out.println(title);
	String s1=title.replaceAll(",", "");
	System.out.println(s1);
	String s2[]=s1.split(" ");
	System.out.println(Arrays.toString(s2));
	for(int i=0;i<s2.length;i++)
	{
		System.out.println(" ");
		System.out.println(i+" index :"+s2[i]);
	}
//Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!
//break down the title into array and array of 0 is going to store online array of 1 going to store shopping.each array should consist of one word.
	}

}
