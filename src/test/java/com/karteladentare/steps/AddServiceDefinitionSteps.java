package com.karteladentare.steps;

import com.karteladentare.steps.serenity.AddServiceEndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddServiceDefinitionSteps {

    @Steps
    AddServiceEndUserSteps addServiceEndUserSteps;

    @Given("the user is on the add service page")
    public void givenTheUserIsOnTheAddServicePage(){
        addServiceEndUserSteps.isOnAddServicePage();
    }

    @When("^the user creates a new service with name \"([^\"]*)\" and price \"([^\"]*)\" and description about service \"([^\"]*)\"$")
    public void the_user_creates_a_new_service_with_name_and_price_and_description_about_service(String name, String price, String description) throws Exception {
        addServiceEndUserSteps.entersData(name, price, description);
        addServiceEndUserSteps.regjistroSherbimin();
    }


    @Then("^They should see the list of services page$")
    public void they_should_see_the_list_of_services_page() throws Exception {
        addServiceEndUserSteps.shouldSeeServiceListPage();
    }


}
