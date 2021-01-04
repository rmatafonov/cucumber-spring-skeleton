package com.github.rmatafonov.library4test.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "com.github.rmatafonov.library4test.servicea")
class ServiceAConfigParameters {
    lateinit var address: String
    lateinit var token: String
}