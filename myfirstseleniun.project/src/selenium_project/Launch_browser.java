package selenium_project;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browser {

	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		//driver.close();
		//driver.quit();
		
	
		/*FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com");
	String title=	driver.getTitle();
	//driver.close();
	driver.quit();*/
	

	
	}

}
