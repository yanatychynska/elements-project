package com.sqa.yt;

import java.util.*;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class SAPTest {

	private static WebDriver driver;

	private String baseUrl = "http://www.sap.com";

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(this.baseUrl);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testByClassName() {
		List<WebElement> buttons = driver.findElements(By.className("button"));
		for (int i = 0; i < buttons.size(); i++) {
			System.out.println(
					"Button #" + (i + 1) + ":" + buttons.get(i).getAttribute("href"));
		}
	}

	@Test
	public void testByCSS() {
		WebElement element = driver.findElement(By.cssSelector(
				"div.content-sapdx-website-nam-usa-en_us-par-bannercenteredfullwidth_7338 a.button"));
	}

	@Test
	public void testById() {
		WebElement mainDiv = driver.findElement(By.id("main"));
	}

	@Test
	public void testByLinkText() {
		WebElement registerButton = driver.findElement(By.linkText("Cookie Preferences"));
	}

	@Test
	public void testByPartialLinkedText() {
		WebElement registerButton = driver.findElement(By.partialLinkText("Register"));
	}

	@Test
	public void testByTagName() {
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (int i = 0; i < images.size(); i++) {
			System.out.println("Image #" + i + ":" + images.get(i).getAttribute("src"));
		}
	}

	@Test
	public void testByXPath() {
		WebElement registerButton = driver.findElement(By.xpath(
				".//*[@id='main']/div/div[4]/div[5]/div/div/div/div/div[2]/div/div/div[2]/a"));
	}
}
