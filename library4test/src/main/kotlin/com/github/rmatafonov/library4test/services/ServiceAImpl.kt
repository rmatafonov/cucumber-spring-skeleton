package com.github.rmatafonov.library4test.services

import com.github.rmatafonov.library4test.config.ServiceAConfigParameters
import com.github.rmatafonov.springutils.annotations.AutowiredLogger
import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class ServiceAImpl : ServiceA {

    @AutowiredLogger
    private lateinit var log: Logger
    @Autowired
    private lateinit var serviceAConfig: ServiceAConfigParameters

    @PostConstruct
    fun postConstruct() {
        log.info("ServiceA config: address: ${serviceAConfig.address}, token: ${serviceAConfig.token}")
    }

    override fun call(param: String): String {
        log.info("ServiceA is called with parameter $param")
        return "ServiceA is called with parameter $param"
    }
}