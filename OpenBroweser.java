package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class OpenBroweser {
	public static void main(String[] args) throws InterruptedException {
//	 		WebDriver dr = new ChromeDriver();
//  		WebDriver dr1=new FirefoxDriver();
//			dr.get("https://www.google.com");
//			dr.manage().window().maximize();
//			Thread.sleep(2000);
//			dr.manage().window().minimize();
//			Thread.sleep(2000);
//			System.out.println(dr.getTitle());
//			dr.close();
		WebDriver dr = new ChromeDriver();
		WebDriver dr1=new FirefoxDriver();
		dr.get("https://www.google.com");
		dr1.get("https://www.gmail.com");
		dr.manage().window().maximize();
		dr1.manage().window().minimize();
		System.out.println(dr.getTitle());
		System.out.println(dr1.getTitle());
		Thread.sleep(2000);
		dr.close();
	}
}
