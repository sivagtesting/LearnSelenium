package week5.day1.testNGLearning;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseUtils {
	
	//Topics covered
	//Learning TestNG annotations and attributes
	
	@Test(invocationCount=2)
	public void createLeadTestcase() throws InterruptedException {
		int i=0, count = 0;
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
				System.out.println(text.charAt(0)=='C');
				if (text.charAt(0) == 'C') {//not working
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
		
		//driver.close();
		//closeApp(); //Not required since we have used TestNG annotations

	}

}
