package stepDefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

public class DuckDuckGoStepDefs {
    @Given("I visit {string}")
    public void i_visit(String url) {
        Driver.getDriver().get(url);
    }
    @Then("I close driver")
    public void i_close_driver() {
        Driver.quitDriver();
    }

}
