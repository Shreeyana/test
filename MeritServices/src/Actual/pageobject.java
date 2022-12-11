package Actual;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Actual.userManagement;

class pageobject {
	WebDriver driver;
	String baseurl;
	userManagement um;

	@BeforeEach
	void setUp() throws Exception {
		driver=new ChromeDriver();
		baseurl="http://merit.ausnep.com/login";
		um=new userManagement(driver);
		  
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@Test
	void test() {
		driver.get(baseurl);
		um.username("admin@test.com");
		um.pass("admin123");
		um.loginsucess();
		um.clickUM();
		driver.navigate().to("http://merit.ausnep.com/admin/admin/create");
		um.fullname("Ramesh Basnet");
		um.email("abc@gmail.com");
		um.pass("123456789");
		um.Repswd("1234567890");
		um.Address("Bafal");
		um.phone("9856787678");
        um.userpic("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
        um.adminreset();
        um.fullname("Shyam Kanti");
		um.email("Shyam@gmail.com");
		um.pass("123456789");
		um.Repswd("123456789");
		um.Address("Kalanki");
		um.phone("9856787668");
        um.userpic("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
        um.adminsuccess();
        um.editadmin();
        um.fullname("Basanti Nepal");
		um.email("Basanti@gmail.com");
		um.pass("123456789");
		um.Repswd("123456789");
		um.Address("Kalanki");
		um.phone("9856787668");
        um.userpic("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
        um.adminsuccess();
        um.deladmin();
      	//lecture 127
        
		
	}
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.manage().window().minimize();
		//driver.quit();
	}

	

}
