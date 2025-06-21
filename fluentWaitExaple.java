package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class fluentWaitExaple {

	@Test
	public void m1() {
		WebDriver d =new ChromeDriver();
		
		d.manage().window().maximize();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		d.get("https://facebook.com");
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		d.findElement(By.id("email")).sendKeys("jhdjh");
		
		d.findElement(By.id("pass")).sendKeys("kajfkjf");
		d.close();
		
	}
}
