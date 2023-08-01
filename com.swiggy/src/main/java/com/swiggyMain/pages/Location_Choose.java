package com.swiggyMain.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location_Choose {
	private Actions actions;
	
	@FindBy(id = "location")
	private WebElement location1;
	

	public Location_Choose(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void Location() throws InterruptedException
	{
		location1.sendKeys("hyderabad");
		Thread.sleep(3000);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	
	
}

