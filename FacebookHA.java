package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHA {
public static void main(String[] args) {
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("https://www.facebook.com");
	chrome.manage().window().maximize();
	WebElement usernamefield = chrome.findElement(By.id("email"));
	usernamefield.sendKeys("testleaf.2023@gmail.com");
	chrome.findElement(By.name("pass")).sendKeys("Tuna@321");
	chrome.findElement(By.name("login")).click();
	chrome.findElement(By.partialLinkText("Find your account and log in")).click();
	System.out.println(chrome.getTitle());
	
}
}
