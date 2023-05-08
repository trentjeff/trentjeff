// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.car.pico;

import java.util.Optional;

import io.helidon.pico.api.Application;
import io.helidon.pico.api.ServiceInjectionPlanBinder;

import jakarta.annotation.Generated;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * io.helidon.examples.pico.car.pico.Pico$$Application - Generated pico Application.
 */
@Generated(value = "io.helidon.pico.maven.plugin.ApplicationCreatorMojo", comments = "version=1")
@Singleton @Named(Pico$$Application.NAME)
public final class Pico$$Application implements Application {

    static final String NAME = "io.helidon.examples.pico.car.pico";
    static boolean enabled = true;

    /**
     * Service loader based constructor.
     *
     * @deprecated this is a Java ServiceLoader implementation and the constructor should not be used directly
     */
    @Deprecated
    public Pico$$Application() {
    }

    @Override
    public Optional<String> named() {
        return Optional.of(NAME);
    }

    @Override
    public String toString() {
        return NAME + ":" + getClass().getName();
    }

    @Override
    public void configure(ServiceInjectionPlanBinder binder) {
        if (!enabled) {
            return;
        }

        /**
         * In module name "io.helidon.examples.pico.car.pico".
         * @see {@link io.helidon.examples.pico.car.pico.BrandProvider }
         */
        binder.bindTo(io.helidon.examples.pico.car.pico.BrandProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.car.pico".
         * @see {@link io.helidon.examples.pico.car.pico.Car }
         */
        binder.bindTo(io.helidon.examples.pico.car.pico.Car$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.car.pico.<init>|2(1)", io.helidon.examples.pico.car.pico.EngineProvider$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.car.pico.<init>|2(2)", io.helidon.examples.pico.car.pico.BrandProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.car.pico".
         * @see {@link io.helidon.examples.pico.car.pico.EngineProvider }
         */
        binder.bindTo(io.helidon.examples.pico.car.pico.EngineProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
        * In module name "io.helidon.examples.pico.car.pico".
        * @see {@link io.helidon.examples.pico.car.pico.Pico$$Module } - note that there are no known contracts or dependencies for this service type.
        */
        // binder.bindTo(io.helidon.pico.runtime.PicoModuleServiceProvider.INSTANCE)

    }

}