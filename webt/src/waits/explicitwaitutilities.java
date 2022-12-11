package waits;

import java.time.Duration;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaitutilities {
	WebDriver driver;
	 
	public  explicitwaitutilities(WebDriver driver) {
		this.driver=driver;
	
	}
	public WebElement waitforElement(By id, int i) {
		WebElement element=null;
		try {
			System.out.println("Searching for the webelement...Have patience ");
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(i));
			element=wait.until(ExpectedConditions.visibilityOfElementLocated(id));
			System.out.println("CONGRATULATION....Element found");
		}
		catch (Exception e) {
			System.out.println("Sorry for inconvenience We can locate Element");
			
		}
		
		 return element;
	}
}
