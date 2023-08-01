package com.swiggyMain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Food_Choose {
	
	@FindBy(xpath = "//div[contains(@class,'gWiXXg')]")
	private WebElement restaurant;
	

	public Food_Choose(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Location2()
	{
		restaurant.click();
	}

}
