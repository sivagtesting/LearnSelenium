package week2HomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The Title of the Page contains the string: 'View Lead'");
		}
		String compNameB4 = driver.findElementById("viewLead_companyName_sp").getText();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("UpdatedTest");
		driver.findElementByXPath("//input[@value='Update']").click();
		String compNameAf = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("CompanyName Before Updating: " + compNameB4 + "\nCompanyName After Updating: "
				+ driver.findElementById("viewLead_companyName_sp").getText());
		if(compNameB4.replaceAll("[^0-9]", "").equals(compNameAf.replaceAll("[^0-9]", ""))) {
			
			System.out.println("The Lead Id is not changed after editing");
			System.out.println("Edit Lead Tcs completed");
		}else
			System.out.println("Lead id has changed Please verify");
		
		

		driver.close();

	}

}