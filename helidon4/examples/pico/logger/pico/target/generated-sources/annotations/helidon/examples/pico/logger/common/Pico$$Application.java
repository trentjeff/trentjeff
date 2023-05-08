// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package helidon.examples.pico.logger.common;

import java.util.Optional;

import io.helidon.pico.api.Application;
import io.helidon.pico.api.ServiceInjectionPlanBinder;

import jakarta.annotation.Generated;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * helidon.examples.pico.logger.common.Pico$$Application - Generated pico Application.
 */
@Generated(value = "io.helidon.pico.maven.plugin.ApplicationCreatorMojo", comments = "version=1")
@Singleton @Named(Pico$$Application.NAME)
public final class Pico$$Application implements Application {

    static final String NAME = "helidon.examples.pico.logger.common";
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
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.AnotherCommunicationMode }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.AnotherCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.logger", io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.Communication }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.Communication$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.<init>|2(1)", io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.<init>|2(2)", io.helidon.examples.pico.logger.common.DefaultCommunicator$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.DefaultCommunicator }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.DefaultCommunicator$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.<init>|1(1)", io.helidon.examples.pico.logger.common.AnotherCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.email", io.helidon.examples.pico.logger.common.EmailCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.im", io.helidon.examples.pico.logger.common.ImCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.sms", io.helidon.examples.pico.logger.common.SmsCommunicationMode$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.EmailCommunicationMode }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.EmailCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.logger", io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.ImCommunicationMode }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.ImCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.logger", io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.LoggerProvider }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .commit();

        /**
        * In module name "helidon.examples.pico.logger.common".
        * @see {@link io.helidon.examples.pico.logger.common.Pico$$Module } - note that there are no known contracts or dependencies for this service type.
        */
        // binder.bindTo(io.helidon.pico.runtime.PicoModuleServiceProvider.INSTANCE)

        /**
         * In module name "helidon.examples.pico.logger.common".
         * @see {@link io.helidon.examples.pico.logger.common.SmsCommunicationMode }
         */
        binder.bindTo(io.helidon.examples.pico.logger.common.SmsCommunicationMode$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.logger.common.logger", io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE)
                .commit();

    }

}