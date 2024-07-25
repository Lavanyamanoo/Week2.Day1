package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountHA {
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
    
    WebElement IndustryWE=chrome.findElement(By.name("industryEnumId"));
    Select IndustryDD = new Select(IndustryWE);
    IndustryDD.selectByIndex(3);
    
    WebElement OwnershipWE=chrome.findElement(By.name("ownershipEnumId"));
    Select OwnershipDD=new Select(OwnershipWE);
    OwnershipDD.selectByVisibleText("S-Corporation");
    
    WebElement SourceWE=chrome.findElement(By.id("dataSourceId"));
    Select SourceDD=new Select(SourceWE);
    SourceDD.selectByValue("LEAD_EMPLOYEE");
    
    WebElement MarketingWE=chrome.findElement(By.id("marketingCampaignId"));
    Select MarketingDD=new Select(MarketingWE);
    MarketingDD.selectByIndex(6);
    
    WebElement StateWE=chrome.findElement(By.id("generalStateProvinceGeoId"));
    Select StateDD=new Select(StateWE);
    StateDD.selectByValue("TX");
    
    chrome.findElement(By.className("smallSubmit")).click();
    System.out.println(chrome.getTitle());
    
    chrome.close();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
