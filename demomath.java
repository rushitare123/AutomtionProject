package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demomath {
int a=10 ,b=0;
	@Test(retryAnalyzer=retry111.class)
	public void m1() {
	//WebDriver d=new ChromeDriver();
	//d.get("https:facebook.com");
	
	
	int c=a/b;
	System.out.println(c);
	//d.close();
	}
		
	}

