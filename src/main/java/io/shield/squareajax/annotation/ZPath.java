package io.shield.squareajax.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import io.shield.squareajax.constant.MessageProtocal;
import org.springframework.stereotype.Component;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@Component
public @interface ZPath {

    public MessageProtocal protocal();

    public boolean sync() default false;
}