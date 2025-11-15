package com.test;
import java.net.MulticastSocket;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class Task {
	public static void main(String[] args) throws InterruptedException {

//		Thread.sleep(2000);
//		dr.manage().window().maximize();
//		WebDriver dr1=new FirefoxDriver();
//		String s="https://www.gmail.com";
//		Thread.sleep(2000);
//		dr1.manage().window().minimize();
//		Thread.sleep(2000);
//		System.out.println(dr.getTitle());
//		System.out.println(s);
//		System.out.println(dr.getCurrentUrl());
//		if(dr.getTitle()==dr1.getTitle())
//			System.out.println("True");
//		else
//			System.out.println("False");
//		System.out.println(dr.getTitle().equals(dr1.getTitle()));

		
//		Thread.sleep(2000);
//		dr.get("https://www.gmail.com");
//		Thread.sleep(2000);
//		dr.navigate().back();
//		Thread.sleep(2000);
//		dr.navigate().forward();
//		Thread.sleep(2000);
//		System.out.println(dr.manage().window().getSize());
//		dr.manage().window().maximize();
//		System.out.println(dr.manage().window().getSize());
		WebDriver dr = new ChromeDriver();
		Dimension d= new Dimension(500, 500);
		dr.manage().window().setSize(d);
		dr.get("https://www.google.com");
		Thread.sleep(2000);
		dr.close();
	}
}
















