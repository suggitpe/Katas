package org.suggs.katas.competent.romannumerals;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.suggs.katas.competent.romannumerals.RomanNumeralConverter.convertRomanNumeral;

/**
 * Steps definition for
 * User: suggitpe
 * Date: 21/05/12
 * Time: 11:19
 */
public class RomanNumeralsStepsdef {

    String romanNumeral;

    @When("^I convert the roman numeral (.+)$")
    public void I_convert_the_roman_numeral_II(String aRomanNumeral) {
        romanNumeral = aRomanNumeral;
    }

    @Then("^the decimal value should be (\\d+)$")
    public void the_decimal_value_should_be(int aConvertedRomanNumeral) {
        assertThat(convertRomanNumeral(romanNumeral), equalTo(aConvertedRomanNumeral));
    }
}
