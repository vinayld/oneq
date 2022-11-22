package Generic_libray;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	public int getRandom()
	{
	Random r=new 	Random();
	return r.nextInt(10000);
		
	}
	
		public void getSelectByIndex(WebElement vinay,int index)
		{
			Select s=new Select(vinay);
			s.selectByIndex(index);
					
		}
		public void getSelectByvalue(WebElement vinay,String value)
		{
			Select s=new Select(vinay);
			s.selectByValue(value);
		}


	public void getselectByvisible(WebElement vinay,String visible)
		{
			Select s=new Select(vinay);
			s.selectByVisibleText(visible);
		}


	}

	
	





