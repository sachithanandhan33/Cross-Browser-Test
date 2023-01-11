package crossbrowser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser_Test 
{
	public static WebDriver driver;
	
  @Test()
  public void lauchsite() throws InterruptedException 
  {
	  driver.get("https://tagexpo.in/");
	  //Thread.sleep(5000);
	  
	  
  }
  
    @BeforeMethod
    @Parameters({"browser"})
  public void Choosing_browser(String browser) throws Exception
  {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
	  }
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Soft\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
      }
	  else if(browser.equalsIgnoreCase("Edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Soft\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
      }
	  
  }

 @AfterMethod
 public void quit_browser()
 {
	 driver.quit();
 }

}
