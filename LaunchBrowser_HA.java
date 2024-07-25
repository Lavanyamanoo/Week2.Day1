package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_HA {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("http://www.facebook.com/");
	chrome.manage().window().maximize();
	Thread.sleep(50000);
	chrome.close();
}
}
