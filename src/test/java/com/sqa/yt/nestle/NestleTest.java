package com.sqa.yt.nestle;

import org.testng.annotations.*;

import com.sqa.yt.helpers.*;

public class NestleTest extends BasicTest {

	public NestleTest() {
		super("http://nestleusa.com");
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "Chocolate" }, new Object[] { "Baby" },
				new Object[] { "Tea" }, new Object[] { "Coffee" },
				new Object[] { "Caramel" }, new Object[] { "Water" }, };
	}

	@Test(dataProvider = "dp")
	public void testNestle1(String item) throws InterruptedException {
		NestleHomePage homePage = new NestleHomePage(getDriver());
		SearchResult searchResults = homePage.searchForItem(item);
		searchResults.logNumOfResults();
		searchResults.takeScreenshot(item);
		Thread.sleep(5000);
		this.getLog().trace("Test is currently running for " + item);
	}
	// @Test
	// public void testNestle1(String item) throws InterruptedException {
	// // NestleHomePage homePage = new NestleHomePage(getDriver());
	// new NestleHomePage(getDriver()).searchForItem(item).takeScreenshot(item);
	// Thread.sleep(5000);
	// this.getLog().trace("Test is currently running for" + item);
	// }
	//
	// OR
	// @Test
	// public void testNestle1() throws InterruptedException {
	// NestleHomePage homePage = new NestleHomePage(getDriver());
	// homePage.searchForItem("Chocolate");
	// homePage.takeScreenshot("Chocolate");
	// Thread.sleep(5000);
	// this.getLog().warn("Test is currently running");
	// }
	//
	//
	// @Test
	// public void testNestle2() throws InterruptedException {
	// NestleHomePage homePage = new NestleHomePage(getDriver());
	// homePage.searchForItem("Coffee");
	// homePage.takeScreenshot("Coffee");
	// Thread.sleep(5000);
	// this.getLog().fatal("Test is currently running adn in fatal status");
	// }
	//
	// @Test
	// public void testNestle3() throws InterruptedException {
	// NestleHomePage homePage = new NestleHomePage(getDriver());
	// homePage.searchForItem("Baby");
	// homePage.takeScreenshot("Baby");
	// Thread.sleep(5000);
	// this.getLog().debug("Test is currently running aand with debug details");
	// }
	//
	// @Test
	// public void testNestle4() throws InterruptedException {
	// NestleHomePage homePage = new NestleHomePage(getDriver());
	// homePage.searchForItem("Tea");
	// homePage.takeScreenshot("Tea");
	// Thread.sleep(5000);
	// Thread.sleep(5000);
	// this.getLog().trace("Test is currently running and does not leave a
	// trace");
	// }
	// OR
	// new NestleHomePage(getDriver()).searchForItem("Chocolate");
	// Thread.sleep(15000);
}