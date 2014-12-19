package com.exemple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exemple.data.UserData;
import com.exemple.utils.ConfigProperties;

public class RegPage extends Page {
	
	@FindBy(xpath = "//*[@id='content']/form/div[1]/fieldset/div[1]/div/input")
	public WebElement fieldFullName;
	
	@FindBy(xpath = "//*[@id='content']/form/div[1]/fieldset/div[2]/div/input")
	public WebElement fieldEmail;
	
	@FindBy(xpath  = "//*[@id='content']/form/div[1]/fieldset/div[3]/div/input")
	public WebElement fieldPhone;
	
	@FindBy(xpath = "//*[@id='content']/form/div[1]/fieldset/div[4]/div/input")
	public WebElement fieldAdress;
	
	@FindBy(xpath = "//*[@id='content']/form/div[1]/fieldset/div[5]/div/input")
	public WebElement fieldCity;
	
	@FindBy(xpath = "//*[@id='content']/form/div[3]/fieldset/div[1]/div/input")
	public WebElement fieldPassword;
	
	@FindBy(xpath = "//*[@id='content']/form/div[3]/fieldset/div[2]/div/input")
	public WebElement fieldPassrepeat;
	
	@FindBy(xpath = "//*[@id='content']/form/div[5]/div/span/button")
	public WebElement fieldChexbox;
	
	@FindBy(xpath = "//*[@id='content']/form/div[5]/div/input[2]")
	public WebElement buttonlogin;
	
	@FindBy(linkText = "Выход")
	public WebElement button;
	
	
	
	public RegPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	public HomePage loginAs(UserData admin) {
		type(fieldFullName, admin.fullName);
		type(fieldEmail, admin.email);
		type(fieldPhone, admin.phone);
		type(fieldAdress, admin.adress);
		type(fieldCity, admin.city);
		type(fieldPassword, admin.password);
		type(fieldPassrepeat, admin.passrepeat);
		fieldChexbox.click();
		buttonlogin.click();
		button.click();
		return PageFactory.initElements(driver, HomePage.class);
		
	}
    @Override
	public void open(){
		driver.get(ConfigProperties.getProperty("login.url"));
	}

	
		

}
