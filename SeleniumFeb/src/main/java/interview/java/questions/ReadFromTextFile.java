package interview.java.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromTextFile {
	
	public static void main(String[] args) throws IOException  {
		
		File textFile = new File("C:\\\\Users\\\\admin\\\\git\\\\LearnSelenium\\\\SeleniumFeb\\\\data\\\\Testing.TXT");
		
		Scanner in = new Scanner(textFile);
			
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();
		
		BufferedReader read = new BufferedReader(new FileReader(textFile));
		String readLine;
		while((readLine=read.readLine())!=null) {
			System.out.println(readLine);
		}
		read.close();
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(time.getTime());
		
		ChromeDriver driver = new ChromeDriver();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/"+time.getTime()+".jpg");
		FileUtils.copyFile(src, dest);
		
		
	}

}
