package com.domain.ddd;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation to make the class a Bean for the framework used in the infrastructure layer.
 * Used for the test phase.
 *
 * @see com.domain.stub
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Stub {
}
