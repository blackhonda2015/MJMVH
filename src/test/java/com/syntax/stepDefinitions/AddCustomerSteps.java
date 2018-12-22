package com.syntax.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.pages.AddCustomer;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {

	AddCustomer newCust;
	WebDriver driver;
	public String name;

	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() throws Throwable {
		LoginPage login = new LoginPage();
		CommonMethods.enterValue(login.username, BaseClass.prop.getProperty("username"));
		CommonMethods.enterValue(login.password, BaseClass.prop.getProperty("password"));
		CommonMethods.click(login.btnLogin);
	}

	@When("^^I am on Time Module$")
	public void i_click_on_Time_Module() throws InterruptedException {
		newCust = new AddCustomer();
		CommonMethods.click(newCust.time);
		Thread.sleep(3000);

	}

	@Given("^I click Project info and select Customers$")
	public void i_click_Project_info_and_select_Customers() {

		CommonMethods.click(newCust.projectInfo);
		CommonMethods.click(newCust.Customers);

	}

	@When("^I click on Add button$")
	public void i_click_on_Add_button() {
		CommonMethods.click(newCust.addButton);
	}

	@When("^I add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_Customer_Name_and_Description(String name, String description) {
//		CommonMethods.enterValue(newCust.customerName, BaseClass.prop.getProperty("name"));
//		CommonMethods.enterValue(newCust.description, BaseClass.prop.getProperty("description"));
		CommonMethods.enterValue(newCust.customerName, name);
		CommonMethods.enterValue(newCust.description, description);

	}

	@When("^I click Save$")
	public void i_click_Save() throws InterruptedException {
		CommonMethods.click(newCust.saveButton);
		Thread.sleep(5000);
	}

	@Then("^I see that the \"([^\"]*)\" is displayed in the Customers table$")
	public void i_see_that_the_is_displayed_in_the_Customers_table(String name) {

		System.out.println(name);
		List<WebElement> verifyAdd = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td/a"));
		for (int i = 0; i < verifyAdd.size(); i++) {
			String text = verifyAdd.get(i).getText();
			if (!text.equals(name)) {
				System.out.println("customer not added");
			} else {
				System.out.println("Customer added");

			}

		}

	}
}
