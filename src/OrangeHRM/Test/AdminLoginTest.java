package OrangeHRM.Test;

import OrangeHRM.Libraries.AdminLoginPage;
import Utils.AppUtils;

public class AdminLoginTest extends AppUtils
{

	public static void main(String[] args) throws Exception  
	{
		// TODO Auto-generated method stub
		
		launchApplication(url);
		
		AdminLoginPage admin=new AdminLoginPage();
		
		boolean result=admin.adminLogin("Admin", "Qedge123!@#");
		
		if(result)
		{
			System.out.println("Admin Login Pass");
		}
		else
		{
			System.out.println("Admin Login Fail");

		}
		
		
		admin.adminLogout();
		
		Thread.sleep(3000);
		
		
		closeApplication();

	}

}
