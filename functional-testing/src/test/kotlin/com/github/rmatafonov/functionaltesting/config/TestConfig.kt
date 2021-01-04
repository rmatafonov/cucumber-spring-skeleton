package com.github.rmatafonov.functionaltesting.config

import com.github.rmatafonov.library4test.config.Library4TestConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.PropertySource
import org.springframework.test.context.TestPropertySource

@Configuration
@ComponentScan("com.github.rmatafonov.functionaltesting.services")
@Import(Library4TestConfig::class)
@PropertySource(value = ["classpath:env-config/service-a-\${test_env:dev}.properties"])
@TestPropertySource(value = ["classpath:env-config/service-a-\${test_env:dev}.properties"])
open class TestConfig {

}