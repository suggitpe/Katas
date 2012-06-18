package org.suggs.katas.novice.fizzbuzz;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Test execution class for the fizz buzz kata.
 * User: suggitpe
 * Date: 07/06/12
 * Time: 07:34
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class FizzBuzzTest {
}
