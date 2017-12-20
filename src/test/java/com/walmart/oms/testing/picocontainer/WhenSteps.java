package com.walmart.oms.testing.picocontainer;

import com.walmart.oms.testing.picocontainer.exemplo1.Execution;

import cucumber.api.java.en.When;

public class WhenSteps {

	private Execution execution;

	public WhenSteps(Execution execution) {
		this.execution = execution;
	}
	
	@When("^I search for the movies listing$")
	public void i_search_for_the_movies_listing() throws Throwable {
		execution.play();
	}
}
