package week5.day2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearnSeleniumGrid {

	public static void main(String[] args) throws IOException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.ANY);
		dc.setBrowserName("chrome");
		//dc.setVersion(version);
		
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4455/wd/hub"), dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		/*driver.findElementById("").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();*/
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		//File src = driver.getScreenshotAs(OutputType.FILE);
		
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File src = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snapshot/snap.jpg");
		FileUtils.copyFile(src, dest);
		
		driver.close();

	}

}
