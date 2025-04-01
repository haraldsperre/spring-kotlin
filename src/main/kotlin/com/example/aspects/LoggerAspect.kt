package com.example.aspects

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import java.time.Duration
import java.time.Instant
import java.util.logging.Level
import java.util.logging.Logger

@Aspect
@Component
@Order(2)
class LoggerAspect {
    private val logger: Logger = Logger.getLogger(LoggerAspect::class.java.name)

    @Around("execution(* com.example.services.*.*(..))")
    @Throws(Throwable::class)
    fun log(joinPoint: ProceedingJoinPoint) {
        logger.info(joinPoint.signature.toString() + " method execution start")
        val start = Instant.now()
        joinPoint.proceed()
        val finish = Instant.now()
        val timeElapsed = Duration.between(start, finish).toMillis()
        logger.info("Time took to execute the method : $timeElapsed")
        logger.info(joinPoint.signature.toString() + " method execution end")
    }

    @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
    fun logException(joinPoint: JoinPoint, ex: Exception) {
        logger.log(
            Level.SEVERE, joinPoint.signature.toString() + " An exception thrown with the help of" +
                    " @AfterThrowing which happened due to : " + ex.message
        )
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..))", returning = "retVal")
    fun logStatus(joinPoint: JoinPoint, retVal: Any) {
        logger.log(
            Level.INFO, joinPoint.signature.toString() + " Method successfully processed with the status " +
                    retVal.toString()
        )
    }
}