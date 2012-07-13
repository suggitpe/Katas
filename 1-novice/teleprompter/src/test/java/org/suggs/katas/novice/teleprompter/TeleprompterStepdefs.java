package org.suggs.katas.novice.teleprompter;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

/**
 * User: suggitpe
 * Date: 15/06/12
 * Time: 20:07
 */
@SuppressWarnings("unused")
public class TeleprompterStepdefs {

    private Teleprompter teleprompter = new Teleprompter();
    private String input;

    @When("^(.+)$")
    public void withInput(String aInput) {
        input = aInput;
    }
    @Then("^(.+)$")
    public void thenOutput(String aOutput){

    }

}
