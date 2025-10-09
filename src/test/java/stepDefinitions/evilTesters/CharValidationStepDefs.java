package stepDefinitions.evilTesters;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.evilTester.CharValidatorPage;

import java.util.List;

public class CharValidationStepDefs {
    CharValidatorPage validatorPage = new CharValidatorPage();
    int dataSize;
    @When("user enter five different valid and five diferent invalid data inputs")
    public void user_enter_five_different_valid_and_five_diferent_invalid_data_inputs(io.cucumber.datatable.DataTable dataTable) {
    List<List<String >> validationList =   dataTable.asLists();
    dataSize = validationList.size();
    for (List<String > valiadation :validationList){
        String testData = valiadation.get(0);
        String validation = valiadation.get(1);
        validatorPage.validateData(testData,validation);
        Assert.assertTrue(validatorPage.isValid(validation));
    }
    }
    @Then("user verifies verifies valid and invalid inputs")
    public void user_verifies_verifies_valid_and_invalid_inputs() {
        Assert.assertEquals(validatorPage.getValidData().size(),dataSize);
        Assert.assertEquals(validatorPage.getInValidData().size(),0);
    }
    @When("user enter {string} in characters field")
    public void user_enter_in_characters_field(String string) {
    validatorPage.enterChar(string);


    }
    @When("clicks on check Input")
    public void clicks_on_check_input() {
        validatorPage.clickValidate();
    }
    @Then("user verifies data is valid")
    public void user_verifies_data_is_valid() {
    Assert.assertTrue(validatorPage.readValidData().equals("Valid Value"));
    }
    @Then("user verifies data is invalid")
    public void user_verifies_data_is_invalid() {
        Assert.assertTrue(validatorPage.readValidData().equals("Invalid Value"));

    }
}
