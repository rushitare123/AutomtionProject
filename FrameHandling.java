package demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rushikesh\\\\Desktop\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		 d.get("https://demo.automationtesting.in/Frames.html");
		 
		 //takes screenshot
		 Date dt=new Date();
		 DateFormat df= new SimpleDateFormat("MM-DD-YYYY-mm-ss");
		 File scre= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 
		 
		 
		 d.switchTo().frame(0);
		
		 d.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("ram is eating a mango");
		  File scre1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scre1, new File("C:\\Users\\Rushikesh\\Desktop\\rushi\\"+df.format(dt)+".png"));

		 System.out.println(d.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value"));
		 
		 d.switchTo().defaultContent();
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		 Thread.sleep(2000);
		 d.switchTo().frame(1);
		 d.switchTo().frame(0);
		 Thread.sleep(2000);
       
		d.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("ram ate a mango");
		  File scre11= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scre11, new File("C:\\Users\\Rushikesh\\Desktop\\rushi\\file\\"+df.format(dt)+".png"));
		System.out.println(d.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value"));
		 
		 d.quit();

	}

}
