package tagexpo_other_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagexpo_Admin_Dashboard 
{
	
	public static WebDriver driver;
	
  @Test
  public void Admin_Dashboard() throws InterruptedException 
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/admin");
	  
	  WebElement adminmail = driver.findElement(By.xpath("//input[@id='email']"));
	  adminmail.sendKeys("admin@admin.com");
	  
	  WebElement adminpass = driver.findElement(By.xpath("//input[@id='password']"));
	  adminpass.sendKeys("1234");
	  
	  WebElement signbtn = driver.findElement(By.xpath("//span[contains(text(),'Sign Me In')]"));
	  signbtn.click();
	  
	  WebElement memberlist = driver.findElement(By.xpath("//span[contains(text(),'Member List')]"));
	  memberlist.click();
	  Thread.sleep(3000);
	  
	  WebElement buyerlist = driver.findElement(By.xpath("//a[contains(text(),'Buyer List')]"));
	  buyerlist.click();
	  Thread.sleep(3000);
	  
	  WebElement menulist = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/button[1]"));
	  menulist.click();
	   
	  WebElement findElement = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[2]"));
	  findElement.click();
	  
	  WebElement findElement2 = driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]"));
	  findElement2.click();
	  
	  
	  
  }
}
