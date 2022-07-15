/**
 * 
 */
package com.practice.datadriven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author RAM
 *
 */
public class WindowHandles {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		Set <String> s=driver.getWindowHandles();
		System.out.println(s);
		for(String i:s)
			{
			String t=driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if(t.contains("Frames & windows")) {
				driver.close();
			}

			}
		}
}
