package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%3Fk%3Dlog%2Binto%2Bmy%2Baccount%2Bamazon%26hvadid%3D504067054278%26hvdev%3Dc%26hvlocphy%3D9028249%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D482593896464818482%26hvtargid%3Dkwd-294882708420%26hydadcr%3D21780_9711378%26tag%3Dgooghydr-20%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Apple@234");
        driver.findElement(By.id("signInSubmit")).click();
        
	}

}
