package com.muhammedtopgul.chapter005.item39.annotationwithparameter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author muhammed-topgul
 * @since 31.01.2022 11:32
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {

    Class<? extends Throwable> value();
}
