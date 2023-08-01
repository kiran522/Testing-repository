package com.swiggyTest.testSteps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order_Food extends Driver2 {
	
	@Given("user in the landing page")
	public void user_in_the_landing_page() {
		String expect = driver.getTitle();
		String actual = "Order food online from India's best food delivery service. Order from restaurants near you";
		//assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
       Assert.assertEquals(actual, expect);
	}

	@When("he type delivery location as Hyderabad and select the first option from the auto-complete box")
	public void he_type_delivery_location_as_hyderabad_and_select_the_first_option_from_the_auto_complete_box() throws InterruptedException {
		location_Choose.Location();
	}

	@When("Click on the first restaurant shown under Top restaurant chains in Hyderabad'")
	public void click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() throws InterruptedException {
		Thread.sleep(10000);
		food_Choose.Location2();
	}

	@When("Click on Add button corresponding to first listed dish")
	public void click_on_add_button_corresponding_to_first_listed_dish() throws InterruptedException {
		Thread.sleep(20000);
		add_food.Add();
		Thread.sleep(10000);
		add_food.AddBtn();
	}

	@When("Hover over Cart in the top right corner")
	public void hover_over_cart_in_the_top_right_corner() throws InterruptedException {
		Thread.sleep(10000);
		add_food.HoverOverToAdd();
	}

	@When("Click on Check Out in the sub-menu")
	public void click_on_check_out_in_the_sub_menu() throws InterruptedException {
		Thread.sleep(10000);
		add_food.CheckOut();
	}

	@Then("Verify the text {string} Is visible on next page")
	public void verify_the_text_is_visible_on_next_page(String string) throws InterruptedException {
		Thread.sleep(10000);
	    String expect = "To place your order now, log in to your existing account or sign up.";
	    String actual = driver.findElement(By.xpath("//div[contains(@class,'axt')]")).getText();
	    Assert.assertEquals(actual, expect);
	}

}
