package com.flipcart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static  WebDriver driver;

	public static void launchChromeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Flipcartcommoxpath\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void send(WebElement loc, String in) {
		loc.sendKeys(in);
	}

	public static void click(WebElement loc) {
		loc.click();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void screenShot(String path) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);
	}

	public static void selectByvalue(WebElement loc, String in) {
		Select s = new Select(loc);
		s.selectByValue(in);
	}

	public static void selectByText(WebElement loc, String in) {
		Select s = new Select(loc);
		s.selectByVisibleText(in);
	}

	public static void selectByIndex(WebElement loc, int i) {
		Select s = new Select(loc);
		s.selectByIndex(i);
	}

}
