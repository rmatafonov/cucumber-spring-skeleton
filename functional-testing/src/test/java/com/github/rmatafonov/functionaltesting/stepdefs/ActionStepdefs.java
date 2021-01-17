package com.github.rmatafonov.functionaltesting.stepdefs;

import com.github.rmatafonov.library4test.services.ServiceA;
import com.github.rmatafonov.springutils.annotations.AutowiredLogger;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class ActionStepdefs {

    @AutowiredLogger
    private Logger log;
    @Autowired
    private ServiceA serviceA;

    @When("my service is called")
    public void myServiceIsCalled() {
        log.info("Service is called: " + serviceA.call("someParam"));
    }
}
