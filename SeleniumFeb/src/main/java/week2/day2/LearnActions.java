package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
	
		
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement draggable = driver.findElementById("draggable");
		
		js.executeScript("arguments[0].scrollIntoView();", draggable);
		
		
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(draggable, 50, 100).perform();
		
		js.executeScript("arguments[0].scrollIntoView();", draggable);
				
		
		builder.click(draggable).dragAndDropBy(draggable, 150, 100).perform();
		
		
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(0);
		WebElement draggable1 = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		builder.dragAndDrop(draggable1, droppable).perform();
		
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Resizable").click();
		driver.switchTo().frame(0);
		WebElement resizable = driver.findElementByXPath("//div[@id='resizable']/div[3]");
		
		builder.click(resizable).dragAndDropBy(resizable, 100, 100).perform();
		
		
		builder.dragAndDropBy(resizable, 100, 100).perform();
		
		
				
		System.out.println("done");
		driver.close();
		
		
	}

}
