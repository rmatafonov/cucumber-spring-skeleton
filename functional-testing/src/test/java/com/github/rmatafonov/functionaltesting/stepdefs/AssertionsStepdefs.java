package com.github.rmatafonov.functionaltesting.stepdefs;

import com.github.rmatafonov.functionaltesting.services.TestContext;
import com.github.rmatafonov.springutils.annotations.AutowiredLogger;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class AssertionsStepdefs {

    @AutowiredLogger
    private Logger log;
    @Autowired
    private TestContext testContext;

    @Then("^the var should be fine$")
    public void theVarShouldBeFine() {
        Allure.addAttachment("Sample attachment", testContext.getSomeVar());
        Assertions.assertThat(testContext.getSomeVar())
                .as("Unexpected var value")
                .isEqualTo("test");
    }
}
