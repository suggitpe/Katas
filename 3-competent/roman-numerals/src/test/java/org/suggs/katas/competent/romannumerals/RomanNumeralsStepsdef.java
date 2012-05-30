package org.suggs.katas.competent.romannumerals;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Steps definition for the roman numerals kata.
 * User: suggitpe
 * Date: 21/05/12
 * Time: 11:19
 */
@SuppressWarnings("unused")
public class RomanNumeralsStepsdef {

    RomanNumeralConverter converter = new RomanNumeralConverter();
    String romanNumeral;

    @When("^I convert the roman numeral (.+)$")
    public void I_convert_the_roman_numeral_II(String aRomanNumeral) {
        romanNumeral = aRomanNumeral;
    }

    @Then("^the decimal value should be (\\d+)$")
    public void the_decimal_value_should_be(int aConvertedRomanNumeral) {
        assertThat(converter.convertRomanNumeral(romanNumeral), equalTo(aConvertedRomanNumeral));
    }
}
