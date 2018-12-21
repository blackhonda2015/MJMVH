package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddCustomer extends BaseClass{
	
	@FindBy(linkText="Time")
	public WebElement time;
	
	@FindBy(linkText="Project Info")
	public WebElement projectInfo;
	
	@FindBy(linkText="Customers")
	public WebElement Customers;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	public WebElement addButton;
	
	@FindBy(xpath="//input[@id='addCustomer_customerName']")
	public WebElement customerName;
	
	@FindBy(xpath="//textarea[@id='addCustomer_description']")
	public WebElement description;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement saveButton;
	
	@FindBy(xpath="//table[@id='resultTable']//tbody")
	public WebElement tableSearch;
	
	@FindBy(xpath="//table[@id='resultTable']//tbody/tr")
	public List<WebElement> verify;
	
	public AddCustomer() {
		PageFactory.initElements(driver, this);

	}
	
}

