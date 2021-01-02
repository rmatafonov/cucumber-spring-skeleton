package com.github.rmatafonov.functionaltesting.stepdefs

import com.github.rmatafonov.functionaltesting.config.TestConfig
import io.cucumber.spring.CucumberContextConfiguration
import org.springframework.test.context.ContextConfiguration

@CucumberContextConfiguration
@ContextConfiguration(classes = [TestConfig::class])
class StepsBackground {
}