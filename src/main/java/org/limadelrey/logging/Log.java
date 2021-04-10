package org.limadelrey.logging;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Documentation: http://www.mastertheboss.com/jboss-frameworks/cdi/interceptors-and-decorators-tutorial.
 */
@InterceptorBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD})
public @interface Log {

}
