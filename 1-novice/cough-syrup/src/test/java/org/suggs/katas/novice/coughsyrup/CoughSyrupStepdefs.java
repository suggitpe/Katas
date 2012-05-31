package org.suggs.katas.novice.coughsyrup;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * User: suggitpe
 * Date: 31/05/12
 * Time: 07:41
 */
@SuppressWarnings("unused")
public class CoughSyrupStepdefs {

    private static final Logger LOG = LoggerFactory.getLogger(CoughSyrupStepdefs.class);

    private DevisorCalculator calculator = new DevisorCalculator();

    private int numerator;
    private int denominator;

    @When("^I calculate the common divisor for (\\d+) / (\\d+)$")
    public void I_calculate_the_common_divisor_for_(int aNumerator, int aDenominator) throws Throwable {
        numerator = aNumerator;
        denominator= aDenominator;
    }

    @Then("^the greatest common divisor should be (\\d+)$")
    public void the_greatest_common_divisor_should_be(int aGCD) throws Throwable {
        assertThat(calculator.calculateGreatestCommonDivisor(numerator, denominator), is(aGCD));
    }
}
