package tagexpo_other_tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatibility_test 
{
    public static WebDriver driver;
    
@Test
public void firefox() throws InterruptedException
	{
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("http://tagexpo.in/");
		  
		  //driver.manage().deleteAllCookies();
		  
		  Set<Cookie>cookies=driver.manage().getCookies();
		  for(Cookie listofcookies:cookies)
		  {
			  System.out.println(listofcookies);				  
		  }
		  
		 Thread.sleep(3000);
		  
		 WebElement whatsappclick=driver.findElement(By.xpath("//*[@id='']"));
		 whatsappclick.click();
		 
		 Thread.sleep(5000);
		 
		 String win1=driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
		 for(String win:windowHandles)
		 {
			 driver.switchTo().window(win);
			 System.out.println("Window Handled...!");
		 }
		 
         Thread.sleep(3000);
         
		 WebElement whatsappwebclick = driver.findElement(By.xpath("//header/div[1]/div[2]/span[1]/span[1]/a[1]/span[1]/span[1]/span[1]"));
		 whatsappwebclick.click();
		 
		  
	}

}
