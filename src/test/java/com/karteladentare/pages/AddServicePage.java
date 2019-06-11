package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://localhost:3000/#!/sherbimet/shtoSherbimin")
public class AddServicePage extends PageObject {

    @FindBy(name="emri")
    private WebElementFacade emri;

    @FindBy(name="cmimi")
    private WebElementFacade cmimi;

    @FindBy(name="shenime")
    private WebElementFacade shenime;

    @FindBy(id="regjistroButton")
    private WebElementFacade regjistroButton;


    public void enterDetails(String emri, String cmimi, String shenime) {
        this.emri.type(emri);
        this.cmimi.type(cmimi);
        this.shenime.type(shenime);

    }

    public void clickRegjistroButton() {
        regjistroButton.click();
    }
}
