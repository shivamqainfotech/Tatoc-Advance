package com.qait.tatocAdvance.specs;

import org.openqa.selenium.By;

public class PageObj {

	
	private By L_adv_course=By.linkText("Advanced Course");
	private By C_menu_2=By.cssSelector(".menutop.m2");
	private By hover_list=By.className("menuitem");
	private By symbol_display=By.id("symboldisplay");
	private By name=By.id("name");
	private By passkey=By.id("passkey");
	private By proceed=By.id("submit");
	
	
	public By getSymbol_display() {
		return symbol_display;
	}
	public By getName() {
		return name;
	}
	public By getPasskey() {
		return passkey;
	}
	public By getProceed() {
		return proceed;
	}
	public By getHover_list() {
		return hover_list;
	}
	public By getL_adv_course() {
		return L_adv_course;
	}
	public By getC_menu_2() {
		return C_menu_2;
	}
	/*public String getHover_script_4() {
		return hover_script_4;
	}*/
	
	
}
