package com.github.rmatafonov.library4test.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.github.rmatafonov.library4test.services")
open class Library4TestConfig