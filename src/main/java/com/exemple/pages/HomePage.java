package com.exemple.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	

	
	@FindBy(linkText = "Зарегистрироваться")
	public WebElement registr;
	
	@FindBy(linkText = "Выход")
	public WebElement reg;
	
	@Override
	public void open() {
		
	}
	
	public boolean isLogOut() {
		if (isElementPresent(registr)) {
			return true;
		}
		else
			return false;
		}
	public boolean isLogIn() {
		if (isElementPresent(reg)) {
			return true;
		}
		else
			return false;
		}
	
	
	
	
}
	


