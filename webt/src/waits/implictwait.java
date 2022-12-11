package waits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import waits.explicitwaitutilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class implictwait {
	WebDriver driver;
	String baseurl;
	explicitwaitutilities wt;
	
	

	@BeforeEach
	void setUp() throws Exception {
		driver= new ChromeDriver();
		baseurl="https://sso.teachable.com/secure/42299/identity/login/password";
		wt=new explicitwaitutilities(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	void test() {
		driver.get(baseurl);
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/div[2]/div/div/a")).click();
		//driver.findElement(By.id("email")).sendKeys("shreeyana");
		//Explicity Wait
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement check = wt.waitforElement(By.id("email"), 4);
		check.sendKeys("Shreeyana");
	}
	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}//lecture 98
}
