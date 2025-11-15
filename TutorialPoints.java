package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TutorialPoints {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement name =d.findElement(By.id("name"));
		WebElement email =d.findElement(By.id("email"));
		
		name.sendKeys("Akash");
		email.sendKeys("akash@gmail.com");
		d.findElement(By.xpath("//input[@id='name']//following::input[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='name']//following::input[5]")).sendKeys("123456789");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='name']//following::input[6]")).sendKeys("16-10-1998");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='name']//following::input[7]")).sendKeys("math");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='name']//following::input[9]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//textarea[@placeholder='Currend Address']")).sendKeys("Bhagur Nashik 422502");
		Thread.sleep(2000);
		WebElement state =d.findElement(By.xpath("//select[@id='state']"));
		Select sr = new Select(state);
		sr.selectByIndex(3);
		Thread.sleep(2000);
		
		d.findElement(By.name("picture")).sendKeys("C:\\users\\cdac\\Pictures\\wallp\\4.jpg");
		
		WebElement city =d.findElement(By.xpath("//select[@id='city']"));
		Select ci = new Select(city);
		System.out.println(city.getText());
		ci.selectByIndex(2);
		
		Thread.sleep(2000);
//		d.findElement(By.xpath("//input[@id='name']//following::input[12]")).click();
		d.findElement(By.xpath("//a[@href='login.php']")).click();
		Thread.sleep(2000);
	
		
		
//		d.close();
		
	}

}
