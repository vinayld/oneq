package Testscript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_libray.Baseclass;
import Generic_libray.CommonUtility;

public class Generalsettings extends  Baseclass {
	@Test
	public void dropdownByIndex()
	{
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/div/div/div/div")).click();
		driver.findElement(By.xpath("//div [contains(text(),'General Settings') and @class='item_title']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='secondHierarchyLevelCode']"));
		CommonUtility cu= new CommonUtility();
		cu.getSelectByIndex(dropdown, 3);
		System.out.println(driver.findElement(By.id("FormModifiedTextCell")).getText());
	}

}
