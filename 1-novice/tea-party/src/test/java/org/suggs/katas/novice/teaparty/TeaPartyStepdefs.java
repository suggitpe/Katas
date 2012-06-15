package org.suggs.katas.novice.teaparty;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: suggitpe
 * Date: 13/06/12
 * Time: 07:21
 */
public class TeaPartyStepdefs {

    private TeaPartyGreeter greeter= new TeaPartyGreeter();
    private String name;
    private boolean female;
    private Boolean knighted;

    @When("^their name is (.+)$")
    public void theirNameIs(String aName) {
        name = aName;
    }

    @When("^when their sex is (.+)$")
    public void whenTheirSexIs(String sex) {
        female = "female".equals(sex)?true:false;
    }

    @When("^when their Knighted status is (.+)$")
    public void whenTheirknightedStatusIs(String isKnighted) {
        knighted = Boolean.parseBoolean(isKnighted);
    }

    @Then("^my greeting should be (.+)$")
    public void myGreetingShouldBe(String aGreeting) throws Throwable {
        assertThat(greeter.welcome(name, female, knighted), is(aGreeting));
    }
}
