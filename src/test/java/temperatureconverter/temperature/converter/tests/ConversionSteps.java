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
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import temperatureconverter.temperature.converter.Google;
import temperatureconverter.temperature.converter.TemperatureConverterPage;

/**
 *
 * @author bpham
 */
public class ConversionSteps {
    
    private WebDriver driver;
    private Google googlePage;
    private TemperatureConverterPage temperatureConverterPage;
    @Given("^I want to  convert (\\d+)\\.(\\d+) degree Fahrenheit to Celsius$")
    public void i_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        googlePage = PageFactory.initElements(driver, Google.class);
        temperatureConverterPage = googlePage.goToTemperatureConversionPage();
    }

    @When("^I input the value of Fahrenheit as (\\d+)\\.(\\d+) in text field$")
    public void i_input_the_value_of_Fahrenheit_as_in_text_field(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        temperatureConverterPage.inputFahrenheit(98.6);
    }

    @Then("^It should be converted to Celsius as (\\d+) degree$")
    public void it_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(temperatureConverterPage.actualResult(), temperatureConverterPage.expectedResult());
        driver.quit();
    }
}
