package com.test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DragAndDrop {

	public static void main(String[] args) throws IOException {
//		WebDriver d = new ChromeDriver();
//		d.get("https://demo.automationtesting.in/Static.html");
//		WebElement w1 = d.findElement(By.id("angular"));
//		WebElement w = d.findElement(By.id("droparea"));
//		WebElement w2 = d.findElement(By.id("mongo"));
//		WebElement w3 = d.findElement(By.id("node"));
//		Actions a= new Actions(d);
//		a.dragAndDrop(w1,w).build().perform();
//		a.dragAndDrop(w2,w).build().perform();
//		a.dragAndDrop(w3,w).build().perform();
		
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		File screnshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(screnshot, new File("D://ss/s.png"));
		//a[@class='button button-orange']//following::a[1]
		d.close();
	}

}
