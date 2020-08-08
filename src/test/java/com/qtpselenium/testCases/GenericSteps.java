package com.qtpselenium.testCases;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;

public class GenericSteps 
{
	
	
	@Given("^I open (.*)$")
	public void openBrowser(String browserName)
	{
		System.out.println("Opening Browser");
	}
	
	@And("^I navigate to (.*)$")
	public void navigate(String url)
	{
		System.out.println("I Navigate to " +url);
	}
	
	@And("^I type (.*) in (.*) Username $")
	public void type(String data, String locatorKey)
	{
		System.out.println("Typing in "+locatorKey+". Data" +data );
	}
	
	@And("^I click on (.*)$")
	public void click(String locatorKey)
	{
		System.out.println("");
	}
	
}
