package demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {


		WebDriver d=new ChromeDriver();
		d.get("http://www.deadlinkcity.com/");
		d.manage().window().maximize();
		
		
		//capture all links from website
		List<WebElement>list=d.findElements(By.tagName("a"));
		
		System.out.println("Total number of links : "+list.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linksElement:list) {
			String herfattValue=linksElement.getAttribute("herf");
			
			if(herfattValue==null || herfattValue.isEmpty()) {
System.out.println("herf atribut value is null or empty so not possible to check");
       continue;
			}
			
			//het url to the server
			try {
				URL linkurl=new URL(herfattValue);
				
				//converted herf value from string to url format
				
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
					
			conn.connect();//connect to server and sent request the server
			
			if(conn.getResponseCode()>=400) {
				System.out.println(herfattValue+ " =Broken linkes=");
				noOfBrokenLinks++;
			}
			else {
				System.out.println(herfattValue +"===Not a Broken links");
			}
			}catch(Exception e) {
				
			}
		}
		System.out.println("Number os broken links : "+noOfBrokenLinks);
		d.close();
	}

}
