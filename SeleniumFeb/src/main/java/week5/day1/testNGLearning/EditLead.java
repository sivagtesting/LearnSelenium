package week5.day1.testNGLearning;

import org.testng.annotations.Test;

public class EditLead extends BaseUtils {
	@Test(dependsOnMethods="week5.day1.testNGLearning.CreateLead.createLeadTestcase")
	public void editLeadTestCase() throws InterruptedException {

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
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyzsiva@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The Title of the Page contains the string: 'View Lead'");
		}
		String compNameB4 = driver.findElementById("viewLead_companyName_sp").getText();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("UpdatedTest");
		driver.findElementByXPath("//input[@value='Update']").click();
		System.out.println("CompanyName Before Updating: " + compNameB4 + "\nCompanyName After Updating: "
				+ driver.findElementById("viewLead_companyName_sp").getText());
		System.out.println("Edit Lead Tcs completed");

		//driver.close();
		//closeApp(); //Not required since we have used TestNG annotations

	}

}