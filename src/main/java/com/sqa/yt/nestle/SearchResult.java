/**
 * File Name: SearchResult.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 4, 2017
 */
package com.sqa.yt.nestle;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.yt.helpers.*;

/**
 * SearchResult //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class SearchResult extends BasicPage {

	@FindBy(id = "numberItem")
	private WebElement searchResultsNum;

	/**
	 * @param driver
	 */
	public SearchResult(WebDriver driver) {
		super(driver);
	}

	public void logNumOfResults() {
		if (this.isElementPresent(By.id("numberItem"))) {
			System.out.println("Number of results:" + this.searchResultsNum.getText());
		} else {
			System.out.println("Number of results: 0");
		}
	}
}
