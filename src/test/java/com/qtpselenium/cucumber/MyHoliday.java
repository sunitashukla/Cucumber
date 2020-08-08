package com.qtpselenium.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class MyHoliday
{
	@Given("I Live in Mascow")
	public void i_live()
	{
		System.out.println("I Live in Mascow");
	}
	
	@And("I want to go on Holiday")
	public void i_want()
	{
		System.out.println("I want to go on Holiday");
	}
	
	@And("we are 10 adults")
	public void we_are()
	{
		System.out.println("we are 10 adults");
	}
	


}
