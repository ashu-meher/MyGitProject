package guru99;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']"));
		
		List<WebElement> dd_menu = driver.findElements(By.xpath(".//ul[@class='dropdown-menu']//li/a"));
		
		for(int i=0;i<dd_menu.size();i++)
		{
		
		WebElement element = dd_menu.get(0);
		
		String innerhtml = element.getAttribute("innerHTML");
		
		if(innerhtml.contentEquals("JavaScript"))
		
		{
			element.click();
			break;
			
		}
		
		
	}
/*
		for (WebElement ele : dd_menu)
			 
	       {
	 
	          // for every elements it will print the name using innerHTML
	 
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	 
	 
	 
	          // Here we will verify if link (item) is equal to Java Script
	 
	          if (ele.getAttribute("innerHTML").contains("JavaScript")) {
	 
	             // if yes then click on link (iteam)
	 
	             ele.click();
	 
	 
	 
	             // break the loop or come out of loop
	 
	             break;
	 */
	          }
	 
	       
		
		
	}

