package steps2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class EditLeadSteps {
	
public ChromeDriver driver;
	
	@Given("Launch the Browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("Max the Browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}

	@And("Set TimeOuts")
	public void setTimeout() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("Launch the URL")
	public void launchURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter userName as (.*)")
	public void enterUName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter passWord as (.*)")
	public void enterPwd(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("Click on SubmitButton")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click on Crmsfa")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@And("Click on Leads Link")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click on findLeads")
	public void findLeads() {
		
	}
	@And("Click on EmailTab")
	public void clickOnEmailTab() {
		
	}
	@And("Enter the Email id as (.*)")
	public void enterEmail(String email) {
		
	}
	@And("Click on FindLeads Button")
	public void clickOnFindLeads() {
		
	}
	
	@And("Click on first resulting LeadId")
	public void clickOnLeadID() {
		
	}
	@And("Click on Edit Button")
	public void clickOnEdit() {
		
	}
	@And("Enter CName as (.*)")
	public void enterCompName(String uCName) {
		
	}
	@And("Click on Update Button")
	public void updateButton() {
		
	}
	
	@And("Verify Lead is updated")
	public void verifyLead() {
		
	}
	@And("Verify Lead id is Not Changed")
	public void verifyUpdatedLeadName() {
		
	}
}
