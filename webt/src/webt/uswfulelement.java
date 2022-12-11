package webt;



import java.time.Duration;
import java.util.List;

import webt.generic;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uswfulelement {
  WebDriver driver=new ChromeDriver();
  String baseurl="https://courses.letskodeit.com/practice";
  private generic gm= new generic(driver);
 
	
@Before
	public	void setUp() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		}	

@Test
		public void test() throws Exception {
	   driver.get(baseurl);
			boolean result =gm.isElementPresent("name","id");
			System.out.println("IS Element present:" + result);
			
			boolean result1 =gm.isElementPresent("hhh","id");
			System.out.println("IS Element present:" + result1);
			
		
			/*String text2 =text.getText();
			System.out.println("print the text is:" +text2);
			text.click();
			//Attribute of the any element
			String att = text.getAttribute("class");
			System.out.println("print ttribute value is :" + att);*/
			
		}
@AfterEach
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	
	}
}
