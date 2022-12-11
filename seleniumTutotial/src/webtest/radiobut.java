package webtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class radiobut {
	WebDriver driver;
	String baseurl;

		@BeforeEach
	void setUp() throws Exception {
		 driver =new ChromeDriver();
		 baseurl="https://higurug.gurugfood.com/";
		 driver.get(baseurl);
		 
		
	}
		@Test
		void test() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[1]/input")).sendKeys("info@ausnepit.com.au");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[2]/input")).sendKeys("Gurugfood@1108");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[4]/button")).click();
			// System.out.println("please Login");
			 Thread.sleep(10000);
			 String tonavigate="https://higurug.gurugfood.com/coupon";
			 driver.navigate().to(tonavigate);
			driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div[2]/div[1]/div[1]/button")).click();
			WebElement Rdabutn =driver.findElement(By.cssSelector("#root > section:nth-child(4) > div.mymodal.modal_activated > div.manage_modal--container > div > div.CouponCode--Modal--form > form > div:nth-child(6) > p:nth-child(1) > label:nth-child(3)"));
			Rdabutn.click();
			System.out.println("Customer");
			
			//Thread.sleep(1000);
			//WebElement Rdabutn1 =driver.findElement(By.xpath("//*[@id=\"root\"]/section[3]/div[1]/div[1]/div/div[2]/form/div[4]/p[2]/input"));
			//Rdabutn1.click();
	       	System.out.println("Resturant");
		}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	

}
