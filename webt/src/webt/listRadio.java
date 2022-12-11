package webt;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadFactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class listRadio {
	WebDriver driver;
	String baseurlgurug,baseurlcodeit;
	boolean isChecked1,isChecked2=false;
	boolean  ischoose=false;
	
	@BeforeEach
	void setUp() throws Exception {
		driver= new ChromeDriver();
		//baseurlgurug ="http://gurugfoodadmin.ausnep.com/";
		baseurlcodeit="https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		//driver.get(baseurlgurug);
		driver.get(baseurlcodeit);
		
		}
	
	@Test
	void test() throws InterruptedException {
		
	/*	driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[1]/input")).sendKeys("super@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/div[2]/input")).sendKeys("12345678");
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[4]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section[3]/section/div/div[3]/a/ul")).click();
		driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/form/div/p/input")).sendKeys("9823714246");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/form/div/p/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/div[2]/div")).click();
		WebElement e1=driver.findElement(By.xpath("/html/body/div/section[2]/div/div[1]/div[4]/div/div/div[1]/p/select"));
		//choosing dropdown option from different list
		Select sel = new Select(e1);
		 //sel.selectByValue("KATHMANDU");
		 Thread.sleep(1000);
		  //sel.selectByIndex(2);
		 // sel.selectByVisibleText("BIRATNAGAR");
		  //list all the options and size from the dropdown
		  List <WebElement> options =sel.getOptions();
		  int size4 =options.size();
		  for(int i=0;i<size4 ;i++) {
			  String optname=options.get(i).getText();
			  System.out.println("" + optname);
			  ischoose= options.get(i).isSelected();
			  if(!ischoose) {
				sel.selectByVisibleText("BIRATNAGAR");
				System.out.println("checking");
			  }
			  else {
				  
			  }
			  
		  }
		  
		 //list of Radio Button  and choosing one by one option by loop statement 
		driver.navigate().to("http://gurugfoodadmin.ausnep.com/coupon");
		  driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div[2]/div[1]/div[1]/button")).click();
		 List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'couponcodeType')]"));
		  int size1 = radiobuttons.size(); 
		  System.out.println("Size of radiobuttons:" + size1);
		  for( int i=0; i<size1 ; i++) {
			  isChecked1 = radiobuttons.get(i).isSelected();
			  //System.out.println("IS working");
			  Thread.sleep(1000);
			  if(!isChecked1) {
				  radiobuttons.get(i).click();
			  }
		  }
		  List<WebElement> radiobuttons1 = driver.findElements(By.name("CouponApplFor"));
		  System.out.println("IS perfectly Working:"+ radiobuttons1);
		   int size2=radiobuttons1.size();
		  System.out.println("size of second radio button is :"+ size2);
		  for(int j=0; j<size2 ; j++) {
			  isChecked2=radiobuttons1.get(j).isSelected();
			  if(!isChecked2) {
				  radiobuttons1.get(j).click();
		  }
		  }
		  List<WebElement> radiobuttons2 = driver.findElements(By.name("applyDiscountOn"));
		  System.out.println("IS perfectly Working:"+ radiobuttons2);
		   int size3=radiobuttons2.size();
		  System.out.println("size of second radio button is :"+ size3);  */
		
		//Mutiple select and deselect  on dropdown
		 WebElement element = driver.findElement(By.id("multiple-select-example"));
		 Select sel =new Select(element);
		 sel.selectByValue("apple");
		  System.out.println("select apple");
		  Thread.sleep(1000);
		  sel.deselectByValue("apple");
		  System.out.println("deselelct apple");
		  sel.selectByIndex(1);
		  System.out.println("Ornage select");
		  Thread.sleep(1000);
		  sel.deselectByIndex(1);
		  System.out.println("deselct Orange");
		  sel.selectByIndex(2);
		  System.out.println("Peach Select");
		 /* List <WebElement> Selected = sel.getOptions();
		  int size5=Selected.size();
		  for(int i=0;i<size5;i++) {
			  String multiple = Selected.get(i).getText();
			  System.out.println("Multiple options are:"+ multiple);*/
			  List <WebElement> optsel =sel.getAllSelectedOptions();
			  for(WebElement options :optsel)
						  {
				 
				  System.out.println("selected options are:"+options.getText());
			  }
			  sel.deselectAll();
			  System.out.println("Dele");
			  }//lecture 77

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	

	

}
