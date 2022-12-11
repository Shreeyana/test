package webt;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class generic {
	WebDriver driver;
	
	public generic(WebDriver driver) {
		this.driver =driver ;
	} 
		public WebElement getElement (String loc,String type) {
			type=type.toLowerCase();
			if(type.equals("id")) {
				System.out.println("Found with ID:"+type);
				return this.driver.findElement(By.id(loc));
			}
			 if (type.equals("xpath")) {
				System.out.println("Found with xtype:"+ type);
				return this.driver.findElement(By.xpath(type));
			}
			 else  {
				System.out.println("NOT FOUND");
				return null;
			}
		}
		public List<WebElement> getElementList (String loc,String type) {
			type=type.toLowerCase();
			List<WebElement> elementlist =new ArrayList<WebElement>();
			if(type.equals("id")) {
				//System.out.println("Found with ID:"+type);
				elementlist= this.driver.findElements(By.id(loc));
			}
			 if (type.equals("xpath")) {
				//System.out.println("Found with xpath:"+ type);
				elementlist= this.driver.findElements(By.xpath(type));
			}
			 if (elementlist.isEmpty())
			 {
				System.out.println("Element not found with:"+ type  +"="  + loc);
				
			}
			 else {
				 System.out.println("Element found with :"+ type  +"="  + loc);
			 }
			  return elementlist;
			 
		}
		public boolean isElementPresent(String loc,String path) {
			List<WebElement> elementlist= getElementList(loc,path);
			int size =elementlist.size();
			if(size>0) {
				return true;
			}
				else {
					return false;
				}
		}
	}


	


