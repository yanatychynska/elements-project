/**
 * File Name: NastleHomePage.java<br>
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
 * NastleHomePage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class NestleHomePage extends BasicPage {

	@FindBy(id = "btnSearch")
	private WebElement searchButton;

	@FindBy(id = "s2id_autogen1")
	private WebElement searchField;

	public NestleHomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @param string
	 */
	public SearchResult searchForItem(String item) {
		this.searchField.clear();
		this.searchField.sendKeys(item);
		this.searchButton.click();
		return new SearchResult(getDriver());
	}

	@Override
	public boolean takeScreenshot(String name) {
		return super.takeScreenshot("Nestle/" + name);
	}
}
