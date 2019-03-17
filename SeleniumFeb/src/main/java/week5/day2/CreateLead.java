package week5.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseUtils {
	
	/*Topics covered
	//Learning TestNG annotations and attributes
	 * Data Provider - to provide each of the tcs its own test data
	 * 
	 * 
	*/
	
	@BeforeTest
	public void setData() {
		dataSheetName = "CreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLeadTestcase(String cName, String fName, String lName, String mail) throws InterruptedException {
		int count = 0;
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

		
			
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys(cName);
			driver.findElementById("createLeadForm_firstName").sendKeys(fName);
			driver.findElementById("createLeadForm_lastName").sendKeys(lName);
			WebElement dropDown = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(dropDown);
			List<WebElement> options = dd1.getOptions();
			for (int j = 0; j < options.size(); j++) {
				String text = options.get(j).getText();
				//System.out.println(text);
				//System.out.println(text.charAt(0));
				//char c = text.charAt(0) ;
				if (text.charAt(0) =='C') {//not working
					count++;
				}
				if (count == 2) {
					dd1.selectByIndex(j);
					break;
				}
	
			}
			driver.findElementById("createLeadForm_primaryEmail").sendKeys(mail);
			driver.findElementByName("submitButton").click();
		

		System.out.println("Create Lead Tcs completed");
		
		//driver.close();
		//closeApp(); //Not required since we have used TestNG annotations

	}
	
	
	/*Commented since data provider is harcorded here
	 * we can manage test data from excel and those steps are common to all tcs hence moving this bit of code to BaseUtils class 
	 * since BaseUtils class is extended by all the tcs
	 * 
	*/
	

	
	/*@DataProvider(name="fetchData")  This can be replaced with below method to get value from excel sheet
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0] = "HCL";
		data[0][1] = "Siva";
		data[0][2] = "G";
		data[1][0] = "TCS";
		data[1][1] = "Preethi";
		data[1][2] = "S";
		return data;
	}*/
	
	/*@DataProvider(name="fetchData")  Again this can be added in a class which is common to all the tcs since these steps are common to all tcs except for the sheet name
	public String[][] getData() throws IOException {

		XSSFWorkbook wBook = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		int rowCount = sheetAt.getLastRowNum(); // ignore header row and provide only actual data rows alone
		short columnCount = sheetAt.getRow(0).getLastCellNum(); // actual column count(physical column count
		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) { // iterating from 1 to avoid header row, limit condition is given as <=
												// since apache poi api ignores header row by default
			XSSFRow row = sheetAt.getRow(i);
			for (int j = 0; j < columnCount; j++) { // limit condition given as < since apache poi api returns the
													// physical column count
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}

		}

		wBook.close();
		return data;

	}*/

}
