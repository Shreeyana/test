package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverWin {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		String baseurl="https://www.instituteforexcellencecentre.com/";
		driver.get(baseurl);
	}

}
