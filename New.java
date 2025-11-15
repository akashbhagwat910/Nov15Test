package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
//		d.manage().window().fullscreen();
//		dr.findElement(By.id("username")).click();
//		Thread.sleep(2000);
//		dr.findElement(By.id("username")).sendKeys("zfsdgdhjf");
//		Thread.sleep(2000);
//		dr.findElement(By.id("username")).clear();
//		Thread.sleep(2000);
//		dr.findElement(By.id("username")).sendKeys("student");
//		dr.findElement(By.id("password")).click();
//		Thread.sleep(2000);
//		dr.findElement(By.id("password")).sendKeys("Password123");
//		Thread.sleep(2000);
//		dr.findElement(By.id("submit")).click();
//		dr.close();
		
		WebElement we =d.findElement(By.id("username"));
//		we.click();
//		Thread.sleep(2000);
//		we.sendKeys("dadad");
//		Thread.sleep(2000);
//		we.clear();
//		Thread.sleep(2000);
//		we.sendKeys("aaaaaa");
//		String s= we.getAttribute("value");
//		System.out.println(s);
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getLocation());
		System.out.println(we.getSize());
		System.out.println(we.getTagName());
		d.findElement(By.id("username")).sendKeys("student");
		d.findElement(By.id("password")).click();
		Thread.sleep(2000);
		d.findElement(By.id("password")).sendKeys("Password1234");
		Thread.sleep(2000);
		d.findElement(By.id("submit")).click();
		WebElement mass =d.findElement(By.id("error"));
		System.out.println(mass.getText());
		
		d.findElement(By.id("username")).click();
		d.findElement(By.id("username")).sendKeys("student123");
		d.findElement(By.id("password")).click();
		Thread.sleep(2000);
		d.findElement(By.id("password")).sendKeys("Password1234");
		Thread.sleep(2000);
		d.findElement(By.id("submit")).click();
		System.out.println(mass.getText());
	}
}
