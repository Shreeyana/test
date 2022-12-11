package Actual;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class userManagement {
	WebDriver driver;
	
	//Login Process
	@FindBy(xpath="//input[@id='email']")
    WebElement username;
	@FindBy(id="password")
    WebElement pass;
	@FindBy(xpath="//button[@class='btn btn-primary btn-rounded']")
    WebElement signin;
	//userManagemnet part
    @FindBy(xpath="//*[@id=\"toggle_nav_btn\"]/i")
    WebElement hambuton;
     
    @FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[5]/a/div[2]")
    WebElement usermanagement;
    
    @FindBy(id="user_dr")
    WebElement admin;
    
    //Add Admin Data Details
    
    @FindBy(id="name")
    WebElement fullname;
    @FindBy(id="email")
    WebElement email;
    @FindBy(id="password")
    WebElement Password;
    @FindBy(id="password_confirmation")
    WebElement Repswd;
    @FindBy(id="address")
    WebElement Address;
    @FindBy(id="phone")
    WebElement phoneno;
    @FindBy(id="image")
    WebElement userpic;
    //Button And Reset
    @FindBy(xpath="//button[@class=\"btn btn-danger\"]")
    WebElement rset;
    @FindBy(xpath="//button[@class=\"btn btn-success\"]")
    WebElement submit;
    //Edit Admin
    @FindBy(xpath="//a[@data-toggle=\"tooltip\"]//i[@class=\"fa fa-edit fa-2x\"]")
    WebElement editadmin;
    //Del Admin
    @FindBy(xpath="//*[@id=\\\"datable_1\\\"]/tbody/tr[1]/td[8]/ul/li[2]/a/form/button/i")
    WebElement deladmin; 
    public userManagement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    public void username(String data) {
 	   username.sendKeys(data);
     }
    public void pass(String data) {
  	   pass.sendKeys(data);
      }
    public void loginsucess() {
    	signin.click();
    }
    public void clickUM() {
    	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));
    	boolean invisible=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader-it")));
    	hambuton.click();
    	usermanagement.click();
    	admin.click();
    }
   public void fullname(String data) {
	   fullname.sendKeys(data);

    }
   public void email(String data) {
	   email.sendKeys(data);
    }
   public void password(String data) { 
	   Password.sendKeys(data);
    }
   public void Repswd(String data) {
	   Repswd.sendKeys(data);
    }
   public void Address(String data) {
	   Address.sendKeys(data);
    }
   public void phone(String data) {
	   phoneno.sendKeys(data);
    }
   public void userpic(String data) {
	   userpic.sendKeys(data);
    }
   
   public void adminreset() {
   	rset.click();
   }
   public void adminsuccess() {
	   	submit.click();
	   }
   public void editadmin() {
	   	editadmin.click();
	   }
   public void deladmin() {
	   deladmin.click(); 
	   Alert alert=driver.switchTo().alert();
         alert.accept();
	   }
}

