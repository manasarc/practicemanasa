package Generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Constants{
	public WebDriver driver;
	@BeforeMethod
	public void openapp(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");}
	@AfterMethod
	public void closeapp(){
		driver.quit();
	}
}
