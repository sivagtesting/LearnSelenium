package week5.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends BaseUtils {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "DeleteLead";
	}
	
	@Test(dependsOnMethods="week5.day2.EditLead.editLeadTestCase",dataProvider="fetchData")
	public void deleteLeadTestCase(String mailId) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password"S).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();*/
		//Instead of re-writing above lines of codes in each test case we can re-use them by 
		//writing them in a common method inside a common class and inheriting the class 
		
		//login(); //inherited method //Not Required since we have used TestNG annotations

		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(mailId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		String firstLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("Resulting ID to be deleted: '" + firstLeadId + "'");
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").clear();
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstLeadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		if (driver.findElementByClassName("x-paging-info").getText().equals("No records to display")) {
			System.out.println("No records to display - Error Message is thrown properly");
		} else {
			System.out.println("No records to display - Not Displayed");
		}

		System.out.println("Delete Lead Tcs completed");

		//driver.close();
		//closeApp(); //Inherited from BaseUtils //Not required since we have used TestNG annotations

	}

}
