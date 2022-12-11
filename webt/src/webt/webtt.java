package webt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver  driver = new ChromeDriver();
    String baseurl ="http://gurugfoodadmin.ausnep.com/";
    driver.get(baseurl);
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/input")).sendKeys("super@gmail.com");
    driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[2]/input")).sendKeys("12345678");
    driver.findElement(By.xpath("/html/body/div/div/div/form/div[4]/button")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
    //driver.close();
	}

}
