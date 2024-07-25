package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadHA {

	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://leaftaps.com/opentaps/");
		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
		chrome.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		chrome.findElement(By.className("decorativeSubmit")).click();
		chrome.findElement(By.partialLinkText("CRM/SFA")).click();
		
		chrome.findElement(By.partialLinkText("Leads")).click();
		chrome.findElement(By.linkText("Create Lead")).click();
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		
		chrome.findElement(By.className("smallSubmit")).click();
		System.out.println(chrome.getTitle());
		chrome.close();
		
		
		
		
		
	}
}
