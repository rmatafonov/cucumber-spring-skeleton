package com.github.rmatafonov.library4test.services

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ServiceAImpl : ServiceA {
    companion object {
        private val log: Logger = LoggerFactory.getLogger(ServiceAImpl::class.java)
    }

    override fun call(param: String): String {
        log.info("ServiceA is called with parameter $param")
        return "ServiceA is called with parameter $param"
    }
}