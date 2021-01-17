package com.github.rmatafonov.springutils.services

import com.github.rmatafonov.springutils.annotations.AutowiredLogger
import org.reflections.ReflectionUtils
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.config.BeanPostProcessor
import java.util.function.Predicate

class AutowiredLoggerBPP : BeanPostProcessor {
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        val allFields = ReflectionUtils.getAllFields(
                bean.javaClass, Predicate { it.isAnnotationPresent(AutowiredLogger::class.java) }
        )

        allFields.forEach {
            it.isAccessible = true
            it.set(bean, LoggerFactory.getLogger(bean.javaClass))
        }

        return super.postProcessBeforeInitialization(bean, beanName)
    }
}