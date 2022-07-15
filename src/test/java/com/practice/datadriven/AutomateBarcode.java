package com.practice.datadriven;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateBarcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String barcode=driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/img")).getAttribute("src");
	    System.out.println(barcode);
	    URL url=new URL(barcode);
	    System.out.println(url);
	    BufferedImage bufferedimage=ImageIO.read(url);
	    System.out.println(bufferedimage);
	    LuminanceSource luminansource=new BufferedImageLuminanceSource(bufferedimage);
	    System.out.println(luminansource);
	    BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(luminansource));
	    Result result=new MultiFormatReader().decode(binarybitmap);
	    System.out.println(result);
	    System.out.println(result.getText());
	    
	    
	}

}
