package week2HomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		int i=0, count = 0;
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
		//for (i = 0; i <= 5; i++) {
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("Test" + i);
			driver.findElementById("createLeadForm_firstName").sendKeys("abc" + i);
			driver.findElementById("createLeadForm_lastName").sendKeys("def" + i);
			WebElement dropDown = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(dropDown);
			List<WebElement> options = dd1.getOptions();
			for (int j = 0; j < options.size(); j++) {
				String text = options.get(j).getText();
				//System.out.println(text);
				//System.out.println(text.charAt(0));
				//char c = text.charAt(0) ;
				//System.out.println(text.charAt(0)=='C');
				if (text.charAt(0) =='C') {//not working
					count++;
				}
				if (count == 2) {
					dd1.selectByIndex(j);
					break;
				}
	
			}
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("xyzsiva@gmail.com");
			driver.findElementByName("submitButton").click();
		//}

		System.out.println("Create Lead Tcs completed");
		driver.close();

	}

}
