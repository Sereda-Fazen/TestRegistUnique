package com.exemple.tests;

import static org.testng.Assert.assertTrue;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.exemple.pages.HomePage;
import com.exemple.pages.RegPage;

public class LoginTest extends BaseTestCase {

	private RegPage RegPage = PageFactory.initElements(getWebDriver(),RegPage.class);
	
	private HomePage homepage;
	
	@Test
	public void testLogin() throws Exception {
		
		RegPage.open();
		homepage = RegPage.loginAs(admin);
		assertTrue(homepage.isLogOut());
		assertTrue(homepage.isLogIn());
		
		
	}

	

	
}
