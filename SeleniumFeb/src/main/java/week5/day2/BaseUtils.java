package week5.day2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;


@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseUtils {
	ChromeDriver driver;
	String dataSheetName;

	/*
	 * Concepts Covered 1) Using TestNG Annotation and configuring common steps for
	 * all tcs to be executed automatically week5.day2: 2) Parameterizing test data
	 * which are common to all tcs(For ex: URL, Username, pwd etc.,) 3) Using Data
	 * provider annotation for test data which are specific to test cases(For ex:
	 * companyName, firstName, lastName
	 */

	@Parameters({ "url", "userName", "passWord" }) // Name should be as per mentioned in xml(need not be same order)
	@BeforeClass
	public void login(String url, String uName, String pwd) { // parameters can be in any name(need not be same as in
																// xml) but order should be based on usage of values
																// inside pgm
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}

	@AfterClass
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return ReadExcel.getExcelData(dataSheetName);

	}

}
