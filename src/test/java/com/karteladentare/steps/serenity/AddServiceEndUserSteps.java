package com.karteladentare.steps.serenity;

import com.karteladentare.pages.AddPatientPage;
import com.karteladentare.pages.AddServicePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddServiceEndUserSteps {

    AddServicePage addServicePage;

    @Step
    public void isOnAddServicePage() {
        addServicePage.open();
    }

    @Step
    public void entersData(String emri, String cmimi, String shenime) {
        addServicePage.enterDetails(emri, cmimi, shenime);
    }

    @Step
    public void regjistroSherbimin() {
        addServicePage.clickRegjistroButton();
    }

    @Step
    public void shouldSeeServiceListPage() {
        assertThat(addServicePage.containsAllText("Lista e Sherbimeve"), equalTo(true));
    }


}
