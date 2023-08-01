package com.swiggyMain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_food {
	private Actions actions;
	
	@FindBy(xpath = "(//div[contains(@class,'RPOp')])[7]")
	private WebElement add;
	
	@FindBy(css = "#root > div._3arMG > header > div > div > ul > li:nth-child(1) > div > div > div > a > span:nth-child(2)")
	private WebElement addBtn;
	
	@FindBy(xpath = "//div[contains(@class,'uP')]")
	private WebElement checkOut;
	
	

	public Add_food(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void Add()
	{
		add.click();
	}
	
	public void AddBtn()
	{
		addBtn.click();
	}
	
	public void HoverOverToAdd()
	{
		actions.moveToElement(addBtn).build().perform();
	}
	
	public void CheckOut()
	{
		checkOut.click();
	}
	
	

}
