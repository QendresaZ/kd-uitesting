package com.karteladentare;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/sherbimet_management/SherbimetManagement.feature")
public class SherbimetDefinitionTestSuite {
}