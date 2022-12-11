package utilities;

import static org.junit.jupiter.api.Assertions.*;
import java.awt.Desktop.Action;
import java.io.File;
import java.time.Duration;
import java.util.Set;
import javax.swing.Scrollable;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v99.indexeddb.model.Key;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.modifiers;

class Modules {
	WebDriver driver;
	String baseurl,T;
	String failure, Parenturl;
	JavascriptExecutor jse;
	modifiers m;

	@BeforeEach
	void setUp() throws Exception {
		driver=new ChromeDriver();
		m=new modifiers(driver);
		jse=(JavascriptExecutor)driver;
		baseurl="http://merit.ausnep.com/login";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
	}
	
	
	@Test
	void test()throws Exception {
		Actions a = new Actions (driver);
		a.sendKeys(Keys.PAGE_UP).build().perform();
		driver.get(baseurl);
		//Login Success And Failure 
		String Parenturl=driver.getCurrentUrl();
		WebElement login=driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("admin@test.com");
		WebElement pwsd=driver.findElement(By.id("password"));
		pwsd.sendKeys("admin123");
		WebElement logb=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-rounded']"));
		logb.click();
		Thread.sleep(1000);
		String current  =driver.getCurrentUrl();
		if(!Parenturl.equals(current)) {
			System.out.println("LOGIN SUCCESS");
		}
		else {
			WebElement failure =m.getlogin("/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]/span/strong");	
				System.out.println("LOGIN FAILURE");
		}		
	
	//Ham Button
	WebElement hambutton=driver.findElement(By.id("toggle_nav_btn"));
	hambutton.click();
	 /* usermanagement section*/driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[5]/a/div[2]")).click();
	 /* usermanagement section->Admin*/driver.findElement(By.id("user_dr")).click(); 
	 /* usermanagement section->Admin->Add*/
	driver.navigate().to("http://merit.ausnep.com/admin/admin/create");
	Thread.sleep(2000); 
	System.out.println("Filling the form have patience "); 
	 //Inputs data of admin Field
	 WebElement fullname =m.getadminAdd("id", "name");
	 fullname.sendKeys("Ramesh Basnet");
	 WebElement Email =m.getadminAdd("id", "email"); 
	 Email.sendKeys("Ramesh200@gmail.com");
	 WebElement Password =m.getadminAdd("id", "password");	
	 Password.sendKeys("12345678");
	 WebElement RePassword =m.getadminAdd("id", "password_confirmation");
	 RePassword.sendKeys("12345678");
	 WebElement Address =m.getadminAdd("id", "address");
	 Address.sendKeys("Kathmandu");
	 WebElement Phone =m.getadminAdd("id", "phone");
	Phone.sendKeys("9823714246");
	WebElement image =m.getadminAdd("id", "image");
	image.sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
	/*Scrolling Section */jse.executeScript("window.scrollTo(0,600)");
	/*Actions */Actions act= new Actions(driver);
	String Addcurrent1=driver.getCurrentUrl();
	WebElement reset=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
	act.click(reset).build().perform();
	Thread.sleep(2000);
	WebElement addsucc=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
	//Retyping all the required fields
	fullname.sendKeys("Mika Singh");
	Email.sendKeys("Mikasingh@gmail.com");
	Password.sendKeys("12345678");
	RePassword.sendKeys("12345678");
	Address.sendKeys("Kathmandu");
	Phone.sendKeys("9987656787");
	image.sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
	act.click(addsucc).build().perform();	
	String Addurl=driver.getCurrentUrl();
	Thread.sleep(2000);
	if(Addcurrent1.equals(Addurl)) {
		System.out.println("FAILED TO ADD:" + Phone);
	}
	else {
		System.out.println("ADDED SUCCESSFULLY");
	}
	//Edit Admin which was added previously 
	WebElement editaddmin=driver.findElement(By.xpath("//a[@data-toggle=\"tooltip\"]"));
	act.click(editaddmin).build().perform();
	 WebElement fullname1 =m.getadminAdd("id", "name");
	 fullname1.clear();
	 WebElement Email1 =m.getadminAdd("id", "email"); 
	 Email1.clear();
	 WebElement checkpswd=m.getadminAdd("name","change_password");
	checkpswd.click();
	 WebElement Password1 =m.getadminAdd("id", "password");	
	 Password1.clear();
	 WebElement RePassword1 =m.getadminAdd("id", "password_confirmation");
	 RePassword1.clear();
	 WebElement Address1 =m.getadminAdd("id", "address");
	 Address1.clear();
	 WebElement Phone1 =m.getadminAdd("id", "phone");
	Phone1.clear();
	WebElement image1 =m.getadminAdd("id", "image");
	image1.clear();
	System.out.println("Editing Is In Progess");
	fullname1.sendKeys("Dance Basnti");
	Email1.sendKeys("BasantiDance@gmail.com");
	Password1.sendKeys("12345678");
	RePassword1.sendKeys("12345678");
	Address1.sendKeys("Maitidevi");
	Phone1.sendKeys("9987656787");
	image1.sendKeys("C:\\Users\\hp\\Pictures\\Screenshots\\failimage.png");
	WebElement eddsucc=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
	act.click(eddsucc).build().perform();
	if(Addcurrent1.equals(Addurl)) {
		System.out.println("FAILED TO Edit:" + Phone);
	}
	else {
		System.out.println("Edited SUCCESSFULLY");
	}
	//Delete Admin which was added previously 
	WebElement deladdmin=driver.findElement(By.xpath("//*[@id=\"datable_1\"]/tbody/tr[1]/td[8]/ul/li[2]/a/form/button/i"));
	act.click(deladdmin).build().perform();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	System.out.println("Successfully Deleted the Data" );
	

	}	
	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(3000);
          driver.manage().window().minimize();
          //driver.quit();
}
}
