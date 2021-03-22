package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils {
	
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com/";
	
	public static void launchApplication(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\QEDGE\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	
	public static void closeApplication()
	{
		driver.close();
	}

}
