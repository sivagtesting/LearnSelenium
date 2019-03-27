package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
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

	@Given("Click on CreateLead link1")
	public void clickCreateLd() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter compName as (.*)")
	public void enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@And("Enter firstName as (.*)")
	public void enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@And("Enter lastName as (.*)")
	public void enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@And("Select Industry1")
	public void selectIndustry() {
		int count = 0;
		WebElement dropDown = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(dropDown);
		List<WebElement> options = dd1.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			if (text.charAt(0) == 'C') {
				count++;
			}
			if (count == 2) {
				dd1.selectByIndex(i);
				break;
			}

		}

	}

	@And("Enter eMail as (.*)")
	public void enterEmail(String mail) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(mail);
	}

	@When("Click on CreateLead button")
	public void clickCreateLdButton() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify Lead creation is Success")
	public void verifyLeadCreated() {
		System.out.println("Create Lead Tcs completed");
	}

	@And("Verify Page Title contains (.*)")
	public void verifyPageTitle(String title) {
		if (driver.getTitle().contains(title)) {
			System.out.println("The Title of the Page contains the string: 'View Lead'");
		}
	}

}
