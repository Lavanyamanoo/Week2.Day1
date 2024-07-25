package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHA {
	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
        chrome.get("http://leaftaps.com/opentaps/");
        chrome.manage().window().maximize();
        chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
        chrome.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        chrome.findElement(By.className("decorativeSubmit")).click();
        chrome.findElement(By.partialLinkText("CRM/SFA")).click();
        chrome.findElement(By.partialLinkText("Accounts")).click();
        chrome.findElement(By.partialLinkText("Create Account")).click();
        chrome.findElement(By.id("accountName")).sendKeys("Tuna");
        chrome.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        chrome.findElement(By.id("numberEmployees")).sendKeys("5");
        chrome.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        chrome.findElement(By.className("smallSubmit")).click();
        System.out.println(chrome.getTitle());
        chrome.close();
        
        
        
	}

}
