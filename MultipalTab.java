package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipalTab {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		String pw=d.getWindowHandle();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.switchTo().newWindow(WindowType.TAB);
		String cw =d.getWindowHandle();
		d.get("https://www.gmail.com");
		d.switchTo().window(pw);
		
	}
}
