package week2HomeWork;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		String leadId = driver.findElementById("viewLead_companyName_sp").getText();
		// leadId.indexOf('(');
		//Learn regular expression and remove the numbers from lead id to make it match with the duplicate lead
		
		driver.findElementByLinkText("Duplicate Lead").click();
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The Title contains 'Duplicate Lead'");
			driver.findElementByName("submitButton").click();
			if (driver.findElementById("viewLead_companyName_sp").getText().replaceAll("\\s.+", "").equals(leadId.replaceAll("\\s.+", ""))) {
				System.out.println(
						"The Dupliacated lead Name: '" + driver.findElementById("viewLead_companyName_sp").getText()
								+ "' is same as capture Lead name: '" + leadId + "'");
				System.out.println("Duplicate Lead Tcs completed");
			} else {
				System.out.println("Duplicate Lead Name is not equal to Copied Lead Name");
				System.out.println(leadId);
				System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
			}

		} else {
			System.out.println("Page title does not Contain 'Duplicate Lead'");
			System.out.println("Duplicate Lead Failed");
		}

		driver.close();

	}

}
