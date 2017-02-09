package com.sqa.yt;

import java.util.*;
import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class MSNElementsTest {

	private static WebDriver driver;

	private String baseUrl = "http://msn.com";

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
	public void testByWeatherPicture() {
		List<WebElement> buttons = driver.findElements(By.className("weathertodaytile"));
	}

	@Test
	public void testFirstItemEditorsSelection() {
		WebElement element = driver.findElement(By.cssSelector("Editor's Pick"));
	}

	@Test
	public void testFirstLinkNews() {
		WebElement element = driver
				.findElement(By.xpath(".//*[@id='main']/div[5]/ul/li[5]/a/div/span[1]"));
	}

	@Test
	public void testSportsMenu() {
		WebElement button = driver.findElement(By.id("Sports"));
	}
}
