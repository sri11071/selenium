package com.unimoni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeHide {


	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']")).click();
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		hide.click();
		Thread.sleep(4000);
		System.out.println("Hide - Displayed: " + driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(4000);
		System.out.println("Hide - Displayed: " + driver.findElement(By.id("displayed-text")).isDisplayed());
	}
}
