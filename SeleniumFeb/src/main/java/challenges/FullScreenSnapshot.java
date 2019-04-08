package challenges;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenSnapshot {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		driver.findElementById("identifierId").sendKeys("sivaharasankar",Keys.ENTER);
		driver.findElementByXPath("//input[@name='password']").sendKeys("@mma00233", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[contains(text(),'Altimetrik')])[3]").click();
		
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new java.awt.Rectangle(screenSize);
		BufferedImage image = new Robot().createScreenCapture(rec);
		ImageIO.write(image, "jpg", new File("./snap/"+time.getTime()+".jpg"));
		driver.close();
	}

}
