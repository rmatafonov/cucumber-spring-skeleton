package com.github.rmatafonov.functionaltesting.stepdefs;

import com.github.rmatafonov.library4test.services.ServiceA;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ActionStepdefs {
    private static final Logger log = LoggerFactory.getLogger(ActionStepdefs.class);

    @Autowired
    private ServiceA serviceA;

    @When("my service is called")
    public void myServiceIsCalled() {
        log.info("Service is called: " + serviceA.call("someParam"));
    }
}
