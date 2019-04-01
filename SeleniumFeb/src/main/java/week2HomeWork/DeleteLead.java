package week2HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyzsiva@gmail.com");
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

		driver.close();

	}

}
