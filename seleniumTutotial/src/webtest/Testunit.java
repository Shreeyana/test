package webtest;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Testunit {
	
	String baseurl;
	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {

		 driver =new ChromeDriver();
		 baseurl="https://learn.letskodeit.com/";
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//System.out.println("Shreeyana");
	}
	@Test
	void test() throws InterruptedException {
		 
		driver.get(baseurl);
		//driver.findElement(By.xpath("//*[@id=\"root\"]//div[1]/input")).sendKeys("info@ausnepit.com.au");
		//driver.findElement(By.xpath("//*[@id=\"root\"]//div[2]/input")).sendKeys("Gurugfood@1108");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[4]/button")).click();
		 //System.out.println("Print Invalid Crdentials");
		String title= driver.getTitle();
		System.out.println("Title is:"+ title);
		
		 String navi=driver.getCurrentUrl();
		 System.out.println("current Url:"+ navi);
		 
		 String tonavigate="https://sso.teachable.com/secure/42299/identity/login/password?wizard_id=lN-PsN-U091gn-Pniv72rt98tjNKMkeGyRN-tqwofCWlUPlO0K5BkpvLylYmee5oE3tfJWj2YlShqJNpdYzFEg"
;		 driver.navigate().to(tonavigate);
                  driver.navigate().refresh();  
                  System.out.println("Refresh");
                  driver.navigate().back();
                  System.out.println("Back");
               driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[1]/a"));
               driver.quit();
               //lecture 72
                  

		  
		  Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]//div[1]/input")).sendKeys("info@ausnepit.com.au");
	   // driver.findElement(By.xpath("//*[@id=\"root\"]//div[2]/input")).sendKeys("Gurugfood@1108");
	    //driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[4]/button")).click();
	    Thread.sleep(1000);
	    
	  
	     driver.navigate().back();
	     }
	

	@AfterEach
	void tearDown() throws Exception {
		
	}

	

}
