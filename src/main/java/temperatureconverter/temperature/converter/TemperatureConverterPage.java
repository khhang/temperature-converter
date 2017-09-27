/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter.temperature.converter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author bpham
 */
public class TemperatureConverterPage {
    private WebDriver driver;
    
    @FindBy(xpath = ".//*[@id='_Aif']/input")
    private WebElement fahrenheitInput;
    
    @FindBy(xpath = ".//*[@id='_Cif']/input")
    private WebElement celsiusInput;
    
    public TemperatureConverterPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getTitle());
        if(!driver.getTitle().equals("from fahrenheit to celsius - Google Search")){
            throw new WrongPageException("Incorrect page for Temperature Converter page");
        }
    }
    
    public void inputFahrenheit(double valueOfFahrenheit){
        String s = Double.toString(valueOfFahrenheit);
        fahrenheitInput.clear();
        fahrenheitInput.sendKeys(s);
//        driver.findElement(By.xpath(".//*[@id='_Aif']/input")).clear();
//        driver.findElement(By.xpath(".//*[@id='_Aif']/input")).sendKeys(s);
    }
    
    public String actualResult(){
        String valueOfCelsius = celsiusInput.getAttribute("value");
//        String valueOfCelsius = driver.findElement(By.xpath(".//*[@id='_Cif']/input")).getAttribute("value");
        System.out.println(valueOfCelsius);
        return valueOfCelsius;
    }
    
    public String expectedResult(){
        return "37";
    }
}
