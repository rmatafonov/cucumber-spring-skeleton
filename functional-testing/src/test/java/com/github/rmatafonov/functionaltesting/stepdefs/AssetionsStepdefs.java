package com.github.rmatafonov.functionaltesting.stepdefs;

import com.github.rmatafonov.functionaltesting.services.TestContext;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AssetionsStepdefs {
    private static final Logger log = LoggerFactory.getLogger(AssetionsStepdefs.class);

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
