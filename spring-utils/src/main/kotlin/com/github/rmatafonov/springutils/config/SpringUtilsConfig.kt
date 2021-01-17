package com.github.rmatafonov.springutils.config

import com.github.rmatafonov.springutils.services.AutowiredLoggerBPP
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SpringUtilsConfig {
    @Bean
    open fun autowiredLoggerBPP() = AutowiredLoggerBPP()
}