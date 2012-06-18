package org.suggs.katas.novice.fizzbuzz;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: suggitpe
 * Date: 07/06/12
 * Time: 19:19
 */
@SuppressWarnings("unused")
public class FizzBuzzStepdefs {

    private Integer number;
    private FizzBuzzer fizzBuzzer = new FizzBuzzer();


    @When("^it is my turn to state the number (\\d+)$")
    public void it_is_my_turn_to_state_the_number(Integer aNumber) {
        number = aNumber;
    }

    @Then("^my response should be (.+)$")
    public void my_response_should_be(String aResponse) {
        assertThat(fizzBuzzer.evaluateSequence(number), is(aResponse));
    }


}
