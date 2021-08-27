package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends SpringIntegrationTest{
	
	
	@When("^the client calls /details$")
	public void the_client_issues_GET_details() throws Throwable{
	    executeGet("http://localhost:8080/details");
	}

	@Then("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {
	    int currentStatusCode = response.statusCode();
	    assertThat("status code is incorrect : "+ 
	    		response.body(), currentStatusCode, is(statusCode));
	}

	@And("^the client receives server version (.+)$")
	public void the_client_receives_server_version_body(String version) throws Throwable {
	    assertThat(response.body(), is(version));
	}
	
}
