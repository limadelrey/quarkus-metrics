package org.limadelrey.logging;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Log
@Slf4j
@Priority(1)
@Interceptor
public final class LogInterceptor {

    /**
     * Log all methods called before and after their execution.
     *
     * @param context Method invocation context
     * @return Method execution response
     * @throws Exception
     */
    @AroundInvoke
    public Object intercept(final InvocationContext context) throws Exception {
        // Log to console before executing method
        log.info("{} method {} called", context.getMethod().getDeclaringClass().getName(), context.getMethod().getName());

        try {
            // Execute method
            final Object result = context.proceed();

            // Log to console after executing method successfully
            log.info("{} method {} call ended successfully", context.getMethod().getDeclaringClass().getName(), context.getMethod().getName());
            return result;
        } catch (Exception ex) {
            // Log to console after executing method with an error
            log.error("{} method {} call ended with an error - {}", context.getMethod().getDeclaringClass().getName(), context.getMethod().getName(), ex.getMessage());
            throw ex;
        }
    }

}
