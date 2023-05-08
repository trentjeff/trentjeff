// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.logger.common;

import io.helidon.pico.api.ModuleComponent;
import io.helidon.pico.api.ServiceBinder;

import jakarta.annotation.Generated;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.util.Optional;

/**
 * Generated pico Module.
 */
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
@Singleton @Named(Pico$$Module.NAME)
public final class Pico$$Module implements ModuleComponent { 
    static final String NAME = "helidon.examples.pico.logger.common";

    /**
     * Service loader based constructor.
     *
     * @deprecated this is a Java ServiceLoader implementation and the constructor should not be used directly
     */
    @Deprecated
    public Pico$$Module() {
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
    public void configure(ServiceBinder binder) {
        binder.bind(io.helidon.examples.pico.logger.common.AnotherCommunicationMode$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.Communication$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.DefaultCommunicator$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.EmailCommunicationMode$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.ImCommunicationMode$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.LoggerProvider$$Pico$$Activator.INSTANCE);
        binder.bind(io.helidon.examples.pico.logger.common.SmsCommunicationMode$$Pico$$Activator.INSTANCE);

    }

}