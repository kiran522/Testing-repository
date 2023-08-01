package com.swiggyTest.testSteps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggyMain.pages.Add_food;
import com.swiggyMain.pages.Food_Choose;
import com.swiggyMain.pages.Location_Choose;

public class Driver2 extends Tool1 {
	
	
	protected static Location_Choose location_Choose;
	protected static Food_Choose food_Choose;
	protected static Add_food add_food;
	
	public static void init()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		location_Choose = new Location_Choose(driver);
		food_Choose = new Food_Choose(driver);
		add_food = new Add_food(driver);
	}

}
