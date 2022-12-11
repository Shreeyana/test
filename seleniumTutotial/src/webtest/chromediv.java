package webtest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//xpath,id,name,classname,tags,linktext,css selctor,partial link text


public class chromediv {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		String baseurl="http://gurugfoodadmin.ausnep.com/";
		driver.get(baseurl); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Live Mode
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[1]/input")).sendKeys("info@ausnepit.com.au");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[2]/input")).sendKeys("Gurugfood@1108");
		//Test Mode
		driver.findElement(By.xpath("//*[@id=\"root\"]//input")).sendKeys("super@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/div[2]/input")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[3]/a/ul")).click();
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[2]/p/input")).click();
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[2]/p/input")).sendKeys("9823714246");
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[2]/p/label")).click();//search
		try { //wait display
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[3]/div")).click();//result
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[5]/div")).click();//OPLocation
		driver.findElement(By.xpath("//*[@id=\"my_children\"]/div/div[1]/div[5]/div/div/div[1]/p/select")).sendKeys("Shreeyana");
		try { //wait display
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().window().minimize();
          driver.findElement(By.className("button_container")).click();
	}//lecture 54
	
	
	}

