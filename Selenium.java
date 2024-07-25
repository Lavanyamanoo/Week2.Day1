package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("http://leaftaps.com/opentaps");
	chrome.manage().window().maximize();
	//Thread.sleep(20000);
	//chrome.close();
	WebElement usernameField=chrome.findElement(By.id("username"));
	usernameField.sendKeys("demosalesmanager");
	chrome.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	chrome.findElement(By.className("decorativeSubmit")).click();
	chrome.findElement(By.partialLinkText("CRM/SFA")).click();
	chrome.findElement(By.linkText("Leads")).click();
	chrome.findElement(By.linkText("Create Lead")).click();
	chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	
	WebElement sourceWE=chrome.findElement(By.id("createLeadForm_dataSourceId"));
	Select sourceDD = new Select(sourceWE);
	sourceDD.selectByIndex(4);
	
	WebElement IndustryWE=chrome.findElement(By.id("createLeadForm_industryEnumId"));
	Select IndustryDD = new Select(IndustryWE);
	IndustryDD.selectByVisibleText("Computer Software");
	
	WebElement OwnershipWE=chrome.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select OwnershipDD = new Select(OwnershipWE);
	OwnershipDD.selectByValue("OWN_PARTNERSHIP");
	
	
	chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("Selenium");
	chrome.findElement(By.className("smallSubmit")).click();
	String leadID=chrome.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println("Lead ID "+leadID);
	chrome.close();
	
	
}
}
