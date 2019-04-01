package week5.day1.testNGLearning;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

public class MergeLead extends BaseUtils {

	// Topics we can see in this merge lead test case
	// 1. Switching to new windows
	// 2. Alert Handling
	// 3. Taking Screenshot
	@Test(enabled=false)
	public void mergeLeadTestCase() throws InterruptedException, IOException {
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();*/
		
		//Instead of re-writing above lines of codes in each test case we can re-use them by 
		//writing them in a common method inside a common class and inheriting the class 
		//login(); //inherited method //Not Required since we have used TestNG annotations

		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']//following-sibling::a").click();

		// Getting WindowHandles using Get Window Handles method

		Set<String> allWindowIds = driver.getWindowHandles();

		List<String> windowIds = new ArrayList<String>();
		windowIds.addAll(allWindowIds);
		// System.out.println(windowIds);
		driver.switchTo().window(windowIds.get(1));
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyzsiva@gmail.com");
		// driver.findElementByXPath("//input[@name='id']").sendKeys("10403");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String fromId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
				.getText();
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(windowIds.get(0));
		driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a").click();
		// Switching to different window using Window Handles

		Set<String> windowHandles = driver.getWindowHandles();
		for (String eachWindow : windowHandles) {
			if (!windowIds.contains(eachWindow)) {
				windowIds.add(eachWindow);
			}
		}
		// System.out.println(windowIds);
		driver.switchTo().window(windowIds.get(2));
		// driver.findElementByXPath("//input[@name='id']").sendKeys("10404");
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyzsiva@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
		driver.switchTo().window(windowIds.get(0));
		driver.findElementByLinkText("Merge").click();

		// Alert Handling

		driver.switchTo().alert().accept();

		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(fromId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		String errMsg = driver.findElementByClassName("x-paging-info").getText();

		// code for screenshot

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/ss1.jpeg");
		FileUtils.copyFile(src, dest);

		if (errMsg.contains("No records to display")) {
			System.out.println("Proper error message '" + errMsg + "' is diplayed");
		} else
			System.err.println(
					"Error Message not proper \n Expected Message = 'No records to display'\nActual Message = '"
							+ errMsg + "'");
		System.out.println("Merge Lead testcase is completed");
		
		//driver.close();
		//closeApp(); //Not required since we have used TestNG annotations

	}

}