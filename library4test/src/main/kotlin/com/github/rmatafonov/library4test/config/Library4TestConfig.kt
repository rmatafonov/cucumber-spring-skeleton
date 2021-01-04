package com.github.rmatafonov.library4test.config

import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.github.rmatafonov.library4test.services")
@ConfigurationPropertiesScan("com.github.rmatafonov.library4test.config")
open class Library4TestConfig