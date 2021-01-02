package com.github.rmatafonov.functionaltesting.config

import com.github.rmatafonov.library4test.config.Library4TestConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan("com.github.rmatafonov.functionaltesting.services")
@Import(Library4TestConfig::class)
//@PropertySource(value = ["classpath:\${APP_ENV:prod}.properties"])
open class TestConfig {

}