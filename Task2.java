package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		String w1=d.getWindowHandle();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.switchTo().newWindow(WindowType.TAB);
		String w2=d.getWindowHandle();
		d.get("https://www.gmail.com");
		d.switchTo().newWindow(WindowType.TAB);
		String w3 =d.getWindowHandle();
		d.get("https://www.youtube.com/");
		Thread.sleep(2000);
		d.switchTo().window(w2);
		Thread.sleep(2000);
		d.switchTo().window(w1);
		Thread.sleep(2000);
		d.switchTo().window(w3);
		Thread.sleep(2000);
		d.close();
		Thread.sleep(2000);
		d.quit();
	}

}
