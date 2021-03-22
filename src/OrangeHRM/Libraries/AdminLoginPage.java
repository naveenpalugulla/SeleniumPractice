package OrangeHRM.Libraries;

import org.openqa.selenium.By;
import Utils.AppUtils;

public class AdminLoginPage extends AppUtils
{
	
	public boolean adminLogin(String uname,String pname)
	{
		String expmsg,actmsg;
		expmsg="dashboard";
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pname);
		driver.findElement(By.id("btnLogin")).click();
		
		actmsg = driver.getCurrentUrl();
		if(actmsg.toLowerCase().contains(expmsg))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean adminLogout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false; 
		}
	}

}
