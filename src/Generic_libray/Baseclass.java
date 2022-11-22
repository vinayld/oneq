package Generic_libray;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class Baseclass {
	public WebDriver driver;
	 public DataUtility du=new DataUtility ();
	@BeforeClass 
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("Url"));
		driver.findElement(By.name("username")).sendKeys(du.getDataFromProperties("username"));
		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
		driver.findElement(By.id("loginButton")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
   public void closeBrowser()
   {
	   driver.close();
   }
}
