/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter.temperature.converter.tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static junit.framework.Assert.fail;

/**
 *
 * @author bpham
 */
public class ConversionSteps {
    @Given("^I want to  convert (\\d+)\\.(\\d+) degree Fahrenheit to Celsius$")
    public void i_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        fail("It is failed");
        throw new PendingException();
    }

    @When("^I input the value of Fahrenheit as (\\d+)\\.(\\d+) in text field$")
    public void i_input_the_value_of_Fahrenheit_as_in_text_field(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^It should be converted to Celsius as (\\d+) degree$")
    public void it_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
