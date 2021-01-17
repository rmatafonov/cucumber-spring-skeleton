package com.github.rmatafonov.library4test.config

import com.github.rmatafonov.springutils.config.SpringUtilsConfig
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(SpringUtilsConfig::class)
@ComponentScan("com.github.rmatafonov.library4test.services")
@ConfigurationPropertiesScan("com.github.rmatafonov.library4test.config")
open class Library4TestConfig