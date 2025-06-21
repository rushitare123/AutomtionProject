package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggation {

	@Test
	public void autosuggationMethod() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rushikesh\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://amazon.in");
		WebElement serch=d.findElement(By.name("field-keywords"));
		JavascriptExecutor js=(JavascriptExecutor)d;
	/* 
	 *  //By using Robot class handla autosuggetion
		Robot r=new Robot();
		serch.sendKeys("iphone");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		*/
		
		
		//without creating any object to handl autosuggation
		serch.sendKeys("iphone");
		serch.sendKeys(Keys.ARROW_DOWN +" "+Keys.ARROW_DOWN +" "+Keys.ARROW_DOWN.ENTER);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "");
		d.close();
	}
} 
