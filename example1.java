package demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example1 {
Date dt;
DateFormat  df;
File scre;

	WebDriver d;
	@Parameters("browser")
	@BeforeMethod
	public void common(String browser) {
		  if(browser.equals("CH")) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Rushikesh\\Desktop\\chromedriver.exe");
       d=new ChromeDriver();
       
		}else if(browser.equals("FF")) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Rushikesh\\Desktop\\geckodriver.exe");
		d=new FirefoxDriver();
		
		}
		d.get("https:facebook.com");
		
		d.manage().window().maximize();
	}
	@AfterMethod
	public void closebrowser() {
		d.quit();
	}
	
	@Test
	public  void test1() throws InterruptedException, IOException {
		 d.findElement(By.name("email")).sendKeys("ram");
		 System.out.println(d.findElement(By.name("email")).getAttribute("value"));
		
		 dt=new Date();
		 df=new SimpleDateFormat("DD-MM-YYYY-mm-ss");
	scre=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scre, new File("C:\\Users\\Rushikesh\\Desktop\\rushi\\amazon\\"+df.format(dt)+".png"));
		 
		 
		 //d.findElement(By.xpath("//a[text()='Create new account']")).click();
	}
	@Test
	public  void test2() throws InterruptedException, IOException {
		 d.findElement(By.name("email")).sendKeys("sham");
		 System.out.println(d.findElement(By.name("email")).getAttribute("value"));
		 dt=new Date();
		 df=new SimpleDateFormat("DD-MM-YYYY-mm-ss");
	scre=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scre, new File("C:\\Users\\Rushikesh\\Desktop\\rushi\\amazon\\"+df.format(dt)+".png"));
		 
		 //d.findElement(By.xpath("//a[text()='Create new account']")).click();
		 }
	@Test
	public  void test3() throws InterruptedException, IOException {
		 d.findElement(By.name("email")).sendKeys("raj");
		 dt=new Date();
		 df=new SimpleDateFormat("DD-MM-YYYY-mm-ss");
	scre=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scre, new File("C:\\Users\\Rushikesh\\Desktop\\rushi\\amazon\\"+df.format(dt)+".png"));
		 
	//	 d.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		 
	}
	
	
}
