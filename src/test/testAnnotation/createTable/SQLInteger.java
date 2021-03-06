package test.testAnnotation.createTable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-16-23:23
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
	String name() default "";

	Constraints constraints() default @Constraints(allowNull = true);
}
