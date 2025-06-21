package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertHandling {

	WebDriver d;
	@Test
	public void m1() {
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert al=d.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		d.close();
	}
}
