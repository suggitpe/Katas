package org.suggs.katas.novice.nasacountdown;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: suggitpe
 * Date: 11/06/12
 * Time: 07:19
 */
@SuppressWarnings("unused")
public class NasaCountdownStepdefs {

    private NasaCountdown countdown = new NasaCountdown();
    private Integer[] countdownSequence;


    @When("^I request a countdown from (\\d+)$")
    public void I_request_a_countdown_from(int aStartingNumber) throws Throwable {
        countdownSequence = countdown.countdown(aStartingNumber);
    }

    @Then("^I expect an array with (\\d+) numbers$")
    public void I_expect_an_array_with_numbers(int totalNumberInCountdownSequence) throws Throwable {
        assertThat(countdownSequence.length, is(totalNumberInCountdownSequence));
    }

    @Then("^the array countdown in order from (\\d+) to (\\d+)$")
    public void the_array_countdown_in_order_from_to(int aBiggestNumber, int aSmallestNumber) throws Throwable {
        assertThat(countdownSequence[0], is(aBiggestNumber));
        assertThat(countdownSequence[countdownSequence.length], is(aSmallestNumber));

    }


}
