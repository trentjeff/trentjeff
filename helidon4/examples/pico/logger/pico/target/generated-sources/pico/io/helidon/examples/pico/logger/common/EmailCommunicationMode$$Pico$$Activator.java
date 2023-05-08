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
 * Activator for {@link io.helidon.examples.pico.logger.common.EmailCommunicationMode}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class EmailCommunicationMode$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<EmailCommunicationMode> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.logger.common.EmailCommunicationMode.class.getName())
            .addExternalContractsImplemented(io.helidon.examples.pico.logger.common.CommunicationMode.class.getName())
            .activatorTypeName(EmailCommunicationMode$$Pico$$Activator.class.getName())
            .addScopeTypeName(jakarta.inject.Singleton.class.getName())
            .addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(jakarta.inject.Named.class, "email"))
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final EmailCommunicationMode$$Pico$$Activator INSTANCE = new EmailCommunicationMode$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected EmailCommunicationMode$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.logger.common.EmailCommunicationMode.class;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.logger.common.EmailCommunicationMode.class.getName())
                .add("logger", java.util.logging.Logger.class, ElementKind.FIELD, Access.PACKAGE_PRIVATE)
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected EmailCommunicationMode createServiceProvider(Map<String, Object> deps) { 
        return new io.helidon.examples.pico.logger.common.EmailCommunicationMode();
    }

    @Override
    protected void doInjectingFields(Object t, Map<String, Object> deps, Set<String> injections, String forServiceType) {
        super.doInjectingFields(t, deps, injections, forServiceType);
        EmailCommunicationMode target = (EmailCommunicationMode) t;
        target.logger = (java.util.logging.Logger) get(deps, "io.helidon.examples.pico.logger.common.logger");
    }

}