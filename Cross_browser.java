package tagexpo_other_tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Cross_browser 
{
	public static WebDriver driver;
	
  @Test
  public void launchsite() 
  {
	  
  }
  @BeforeMethod
  public void Choosing_browser(String browser) throws Exception
  {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		//  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
      }
	  else if(browser.equalsIgnoreCase("Edge"))
	  {
		 // System.setProperty("webdriver.edge.driver", "C:\\Soft\\msedgedriver.exe");
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
      }

   
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
