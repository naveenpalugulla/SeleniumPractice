package OrangeHRM.Test;

import OrangeHRM.Libraries.EmployeeLoginPage;
import Utils.AppUtils;

public class EmployeeLoginTest extends AppUtils
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launchApplication(url);
		
		EmployeeLoginPage emp=new EmployeeLoginPage();
		boolean result = emp.employeeLogin("Naveenkumar", "Naveen@123");
		
		if(result)
		{
			System.out.println("Employee Login Pass");
		}
		else
		{
			System.out.println("Employee Login Fail");
		}
		
		Thread.sleep(3000);

		emp.employeeLogout();
		
		
		
		closeApplication();
	}

}
