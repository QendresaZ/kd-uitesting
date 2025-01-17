package com.karteladentare.steps;

import com.karteladentare.steps.serenity.AddPatientEndUserSteps;
import com.karteladentare.steps.serenity.DeletePatientEndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeletePatientDefinitionSteps {

    @Steps
    DeletePatientEndUserSteps deletePatientEndUserSteps;

    @Given("^the user is on the patients list page$")
    public void theUserIsOnThePatientsListPage() throws Throwable {
        deletePatientEndUserSteps.isOnPatientsListPage();
    }

    @When("^the user deletes patient with personal number (.*) in the table$")
    public void theUserDeletesPatientWithPersonalNumberInTheTable(String numriPersonal) throws Throwable {
        deletePatientEndUserSteps.deletePatient(numriPersonal);
    }

    @Then("^They should see the list without patient with personal number (\\d+)$")
    public void theyShouldSeeTheListWithoutPatientWithPersonalNumber(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
