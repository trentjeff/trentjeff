// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.logger.common;

import io.helidon.common.Weight;
import io.helidon.common.Weighted;

import io.helidon.pico.api.DependenciesInfoDefault;
import io.helidon.pico.api.ServiceInfoDefault;
import io.helidon.pico.api.DependenciesInfo;
import io.helidon.pico.api.PostConstructMethod;
import io.helidon.pico.api.PreDestroyMethod;
import io.helidon.pico.api.RunLevel;
import io.helidon.pico.runtime.Dependencies;

import jakarta.annotation.Generated;
import jakarta.inject.Provider;
import jakarta.inject.Singleton;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static io.helidon.pico.api.ElementInfo.Access;
import static io.helidon.pico.api.ElementInfo.ElementKind;
import static io.helidon.pico.api.InjectionPointInfo.CONSTRUCTOR;

/**
 * Activator for {@link io.helidon.examples.pico.logger.common.Communication}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class Communication$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<Communication> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.logger.common.Communication.class.getName())
            .activatorTypeName(Communication$$Pico$$Activator.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final Communication$$Pico$$Activator INSTANCE = new Communication$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected Communication$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.logger.common.Communication.class;
    }

    @Override
    public boolean isProvider() {
        return true;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.logger.common.Communication.class.getName())
                .add(CONSTRUCTOR, java.util.logging.Logger.class, ElementKind.CONSTRUCTOR, 2, Access.PUBLIC).elemOffset(1)
                .add(CONSTRUCTOR, io.helidon.examples.pico.logger.common.Communicator.class, ElementKind.CONSTRUCTOR, 2, Access.PUBLIC).elemOffset(2)
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected Communication createServiceProvider(Map<String, Object> deps) { 
        java.util.logging.Logger c1 = (java.util.logging.Logger) get(deps, "io.helidon.examples.pico.logger.common.<init>|2(1)");
        io.helidon.examples.pico.logger.common.Communicator c2 = (io.helidon.examples.pico.logger.common.Communicator) get(deps, "io.helidon.examples.pico.logger.common.<init>|2(2)");
        return new io.helidon.examples.pico.logger.common.Communication(c1, c2);
    }

    @Override
    public Optional<PostConstructMethod> postConstructMethod() {
        Communication target = (Communication) serviceRef().orElseThrow();
        return Optional.of(target::postConstruct);
    }

}