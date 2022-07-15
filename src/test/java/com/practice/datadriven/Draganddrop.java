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
public class Draganddrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.xpath("//div[@id='box1']"));
	    WebElement dest=driver.findElement(By.xpath("//div[@id='box101']"));
	    Actions act=new Actions(driver);
	    //act.clickAndHold(source).moveToElement(dest).release().build().perform();
	    act.dragAndDrop(source, dest).build().perform();
	    
	
	}
	

}
