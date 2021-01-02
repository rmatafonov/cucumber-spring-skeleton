package com.github.rmatafonov.functionaltesting.stepdefs;

import com.github.rmatafonov.functionaltesting.services.TestContext;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class SetUpStepdefs {
    @Autowired
    private TestContext testContext;

    @Given("^set some var for REST$")
    public void setSomeVarForREST() {
        testContext.setSomeVar("test");
    }
}
