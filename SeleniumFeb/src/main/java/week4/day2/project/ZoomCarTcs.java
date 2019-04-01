package week4.day2.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCarTcs {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div[2]").click();
		driver.findElementByXPath("//button[text()='Next']").click();

		// Get the current date

		Date date = new Date();

		// Get only the date (and not month, year, time etc)

		DateFormat sdf = new SimpleDateFormat("dd");

		// Get today's date

		String today = sdf.format(date);

		// Convert to integer and add 1 to it

		int tomorrow = Integer.parseInt(today) + 1;

		// Print tomorrow's date

		// System.out.println(tomorrow);

		driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		String pickedDate = driver.findElementByXPath("//div[contains(text(),'" + tomorrow + "')]")
				.getAttribute("class");
		if (pickedDate.contains("picked")) {
			driver.findElementByXPath("//button[text()='Done']").click();
			List<WebElement> listOfCars = driver.findElementsByXPath("//div[@class='car-list-layout']/div");
			System.out.println("There were " + listOfCars.size() + " search results found for your search Criteria");
			List<WebElement> priceWebEle = driver.findElementsByXPath("//sup[@class='rupee']");
			List<Integer> priceList = new ArrayList<Integer>();
			for (WebElement eachPrice : priceWebEle) {
				priceList.add(Integer.parseInt(eachPrice.getText()));
			}

		}

	}

}
