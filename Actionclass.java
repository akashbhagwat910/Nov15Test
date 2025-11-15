package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://accounts.saucelabs.com/am/XUI/#login/");
		System.out.println(d.getTitle());
		WebElement texbox=d.findElement(By.id("idToken1"));
		Actions a= new Actions(d);
		a.moveToElement(texbox).contextClick().build().perform();
		texbox.sendKeys("sgsdhdh dgggg");
		a.doubleClick(texbox).doubleClick(texbox).build().perform();
		
	}

}
