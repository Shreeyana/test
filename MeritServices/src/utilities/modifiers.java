package utilities;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class modifiers {
	WebDriver driver;
	 public modifiers(WebDriver driver) {
		 this.driver=driver;
	 }
       public  WebElement getlogin(String xp) {
    	   //Login modules
    WebElement failure =driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]/span/strong"));
    	   if(xp.isBlank()) {
   			return this.driver.findElement(By.xpath(xp));
   		}
    	   return failure;
       }
       //UserManagemnet Add Admin Test case
       public  WebElement getadminAdd(String Type,String value) {
    	 WebElement  userinfo=driver.findElement(By.id(value)) ;
    	 if(Type.isBlank()) {
    			return this.driver.findElement(By.id(value));
    		}
     	   return userinfo;
        }
 
}