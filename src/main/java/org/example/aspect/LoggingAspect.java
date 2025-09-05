package org.example.aspect;

import io.micrometer.common.util.internal.logging.Slf4JLoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(2)
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) {
        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue;
        try {
            returnedValue = joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
        return returnedValue;
    }
}
