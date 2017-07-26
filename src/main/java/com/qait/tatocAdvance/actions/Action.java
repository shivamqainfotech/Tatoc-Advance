package com.qait.tatocAdvance.actions;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qait.tatocAdvance.driver.DriverClass;
import com.qait.tatocAdvance.specs.PageObj;
import com.qait.tatocAdvance.utility.Utility;

public class Action {

	WebDriver driver;
	private PageObj pageObj = new PageObj();
	private Utility utility = new Utility();

	public Action(WebDriver driver) {
		this.driver = driver;
		DriverClass.maximizeWindow();
		DriverClass.getUrl();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void select_advance() {
		driver.findElement(pageObj.getL_adv_course()).click();
	}

	public void hover_over_than_click() {
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(pageObj.getC_menu_2())).perform();
		List<WebElement> list = driver.findElements(pageObj.getHover_list());
		list.get(3).click();
	}

	public void enter_name_and_pass_key_obtained_from_DB_and_click_proceed() throws SQLException {
		String symbol = driver.findElement(pageObj.getSymbol_display()).getText();
		utility.execute_Query(symbol);
		driver.findElement(pageObj.getName()).sendKeys(Utility.id);
		driver.findElement(pageObj.getPasskey()).sendKeys(Utility.passkey);
		driver.findElement(pageObj.getProceed()).click();

	}

}
