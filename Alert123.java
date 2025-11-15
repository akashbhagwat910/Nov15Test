package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert123 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a1=d.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		
		
		d.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Alert a2=d.switchTo().alert();
		a2.dismiss();
		System.out.println(d.findElement(By.id("demo")).getText());
		d.close();
	}

}
