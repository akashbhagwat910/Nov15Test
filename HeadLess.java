package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class HeadLess {
	public static void main(String[] args) {
		ChromeOptions cc=new ChromeOptions();
		cc.addArguments("headless");
		WebDriver dr=new ChromeDriver(cc);
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
		
		FirefoxOptions ff=new FirefoxOptions();
		ff.addArguments("--headless");
		WebDriver df=new FirefoxDriver(ff);
		df.get("https://www.youtube.com/");
		System.out.println(df.getTitle());
		
		cc.addArguments("Incognito");
		WebDriver d=new ChromeDriver(cc);
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
	}
}
