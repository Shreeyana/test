package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.Duration;
import java.util.Set;

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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

class demoss {
	WebDriver driver;
	String baseurl;
	JavascriptExecutor jse;

	@BeforeEach
	void setUp() throws Exception {
		driver=new ChromeDriver();
		jse=(JavascriptExecutor)driver;
		baseurl="https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@Test
	void test() throws Exception {
		driver.get(baseurl);
		/*String parenthandel =driver.getWindowHandle();
		System.out.println("Parent HAndel:" +parenthandel);
		
		//open next window
		WebElement openwindow =driver.findElement(By.id("openwindow"));
		openwindow.click();
		
		//Get all the handels
		Set<String> handels=driver.getWindowHandles();
		
		for(String handel :handels) {
			System.out.println("allThe windows:"+ handel);
			if(!handel.equals(parenthandel)) {
				driver.switchTo().window(handel);
				Thread.sleep(1000);
				WebElement searchbox =driver.findElement(By.name("course"));
				searchbox.sendKeys("Shree");
				driver.close();
				break;
			}
			//driver.switchTo().window(parenthandel);
			//JS handling for popup
			driver.findElement(By.id("name")).sendKeys("shree");
			driver.findElement(By.id("alertbtn")).click();
			Alert alert=driver.switchTo().alert();
			Thread.sleep(3000);
			alert.accept();
			//JS handling forConfirm popup
			driver.findElement(By.id("name")).sendKeys("shree");
			driver.findElement(By.id("confirmbtn")).click();
			Alert alert1=driver.switchTo().alert();
			Thread.sleep(2000);
			alert1.dismiss();*/
			jse.executeScript("window.scrollTo(0,600)");
			//Actions  Need to perform 
			WebElement element1=driver.findElement(By.id("mousehover"));
			Actions act=new Actions(driver);
			act.moveToElement(element1).perform();
			
			WebElement element2 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/fieldset/div/div/a[1]"));
			act.moveToElement(element2).click().perform();
			driver.findElement(By.name("enter-name")).sendKeys(Keys.PAGE_DOWN);
			
		}//lecture 118

	@AfterEach
	void tearDown() throws Exception {
		
		//driver.manage().window().minimize();
		//driver.quit();
	}
	
}
