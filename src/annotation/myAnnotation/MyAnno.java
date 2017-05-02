package annotation.myAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by alexfomin on 02.05.17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String name();
    int value();
}
