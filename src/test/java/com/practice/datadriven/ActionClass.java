/**
 * 
 */
package com.practice.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author RAM
 *
 */
public class ActionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/authe/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions act=new Actions(driver);
		WebElement admin=driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		WebElement UserMgmt=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement User=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	    act.moveToElement(admin).build().perform();
	    act.moveToElement(UserMgmt).build().perform();
	    act.moveToElement(User).click().build().perform();
	}

}
