package Testscript1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_libray.Baseclass;
import Generic_libray.CommonUtility;

public class CustomerCreation extends Baseclass   {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		CommonUtility cu=new CommonUtility ();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100);");
		driver.findElement(By.id("container_tasks")).click();
		js.executeScript("window.scrollBy(0,100);");
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		String value=du.getDataFromExcelSheet("Sheet1", 0, 0)+cu.getRandom();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(value);
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated((By.cssSelector(".titleEditButtonContainer>.title")), value));
		String expectedResult=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(expectedResult);

		
	}
}

	