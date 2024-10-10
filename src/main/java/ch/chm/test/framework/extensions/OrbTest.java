package ch.chm.test.framework.extensions;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;

import ch.chm.test.framework.extensions.asteroid.AsteroidSupport;
import ch.chm.test.framework.extensions.moon.MoonSupport;
import ch.chm.test.framework.extensions.asteroid.Asteroid;
import ch.chm.test.framework.extensions.moon.Moon;

/**
 * The {@link OrbTest} provides a JUnit 5 setup for the junit-jupiter extensions.<br/>
 * This is a shortcut to various extensions, namely
 * {@link MoonSupport} to inject {@link Moon} and
 * {@link AsteroidSupport} to inject {@link Asteroid}.
 *
 */
@ExtendWith(MoonSupport.class)
@ExtendWith(AsteroidSupport.class)
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface OrbTest {
}
