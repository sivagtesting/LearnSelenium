package week2.day1.HomeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCUserCreation {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("xyz_id");
		driver.findElementById("userRegistrationForm:password").sendKeys("123456_siva");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("123456_siva");
		
		//DropDown
		
		WebElement dropDown = driver.findElementById("userRegistrationForm:securityQ"); // Storing the dropdown in a webelement
		Select dd1 = new Select(dropDown);
		dd1.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("BowWow");
		
		//DropDown2
		if(driver.findElementById("userRegistrationForm:prelan").isSelected())
		System.out.println("The DropDown is already selected");
		
		WebElement dropDown1 = driver.findElementById("userRegistrationForm:prelan"); // Storing the dropdown in a webelement
		Select dd2 = new Select(dropDown1);
		dd2.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Siva");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("hara");
		driver.findElementByName("userRegistrationForm:lastName").sendKeys("Sankar");
		
		//This is webTable - Learn to find out
		
		driver.findElementByXPath("//input[@value='M']").click(); //Relative Xpath
		driver.findElementByXPath("//input[@value='U']").click(); //Relative Xpath
		
		//date of birth
		Select dd3 = new Select(driver.findElementByName("userRegistrationForm:dobDay"));
		dd3.selectByValue("14");
		
		//Month
		Select dd4 = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		dd4.selectByVisibleText("APR");
		
		//Year
		Select dd5 = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		dd5.selectByIndex(10);
		
		Select dd6 = new Select(driver.findElementById("userRegistrationForm:occupation"));
		dd6.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("1321 1234 1234");
		driver.findElementById("userRegistrationForm:idno").sendKeys("EFBPS2316n");
		
		Select dd7 = new Select(driver.findElementByXPath("//select[@name='userRegistrationForm:countries']"));
		dd7.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("xyzz@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
		
		Select dd8 = new Select(driver.findElementByXPath("//select[@name='userRegistrationForm:nationalityId']"));
		dd8.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("10");
		driver.findElementById("userRegistrationForm:street").sendKeys("avenue road");
		driver.findElementById("userRegistrationForm:area").sendKeys("Sholinganallur");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600119");
		
		Thread.sleep(3000);
		
		Select dd9 = new Select(driver.findElementById("userRegistrationForm:cityName"));
		dd9.selectByIndex(1);
		
		Thread.sleep(3000);
		
		Select dd10 = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		dd10.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("1234567890");
		
		

	}

}
