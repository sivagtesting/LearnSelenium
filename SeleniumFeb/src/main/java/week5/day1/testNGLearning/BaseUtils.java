package week5.day1.testNGLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseUtils {
	ChromeDriver driver;
	
	/*Concepts Covered
	1) Using TestNG Annotation and configuring common steps for all tcs to be executed automatically
	*/
	
	
	@BeforeClass
	public void login() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}
	
	@AfterClass
	public void closeApp() {
		driver.close();
	}

}
