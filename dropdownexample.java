package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class dropdownexample {

	@Test
	public void m1() {
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://facebook.com");
		
		d.manage().window().maximize();
		
		//links of current page
		List<WebElement>list=d.findElements(By.tagName("a"));
System.out.println(list.size());
		
		for(WebElement e:list) {
			System.out.println(e);
		}
		/*
		
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Select se=new Select(d.findElement(By.name("birthday_day")));
		se.selectByIndex(11);
		WebElement day=d.findElement(By.name("birthday_day"));		
		day.click();
		day.sendKeys(Keys.ARROW_DOWN);//26
		day.sendKeys(Keys.ARROW_DOWN);//27
		day.sendKeys(Keys.ENTER);
		System.out.println(day.getAttribute("value"));
		*/
		d.close();
		
	}
}
