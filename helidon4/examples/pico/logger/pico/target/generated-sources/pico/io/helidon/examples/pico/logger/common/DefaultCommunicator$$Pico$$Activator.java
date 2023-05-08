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
 * Activator for {@link io.helidon.examples.pico.logger.common.DefaultCommunicator}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class DefaultCommunicator$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<DefaultCommunicator> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.logger.common.DefaultCommunicator.class.getName())
            .addExternalContractsImplemented(io.helidon.examples.pico.logger.common.Communicator.class.getName())
            .activatorTypeName(DefaultCommunicator$$Pico$$Activator.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final DefaultCommunicator$$Pico$$Activator INSTANCE = new DefaultCommunicator$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected DefaultCommunicator$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.logger.common.DefaultCommunicator.class;
    }

    @Override
    public boolean isProvider() {
        return true;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.logger.common.DefaultCommunicator.class.getName())
                .add(CONSTRUCTOR, io.helidon.examples.pico.logger.common.CommunicationMode.class, ElementKind.CONSTRUCTOR, 1, Access.PUBLIC).elemOffset(1)
                .add("email", io.helidon.examples.pico.logger.common.CommunicationMode.class, ElementKind.FIELD, Access.PUBLIC).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(jakarta.inject.Named.class, "email"))
                .add("im", io.helidon.examples.pico.logger.common.CommunicationMode.class, ElementKind.FIELD, Access.PUBLIC).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(jakarta.inject.Named.class, "im"))
                .add("sms", io.helidon.examples.pico.logger.common.CommunicationMode.class, ElementKind.FIELD, Access.PUBLIC).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(jakarta.inject.Named.class, "sms"))
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected DefaultCommunicator createServiceProvider(Map<String, Object> deps) { 
        io.helidon.examples.pico.logger.common.CommunicationMode c1 = (io.helidon.examples.pico.logger.common.CommunicationMode) get(deps, "io.helidon.examples.pico.logger.common.<init>|1(1)");
        return new io.helidon.examples.pico.logger.common.DefaultCommunicator(c1);
    }

    @Override
    protected void doInjectingFields(Object t, Map<String, Object> deps, Set<String> injections, String forServiceType) {
        super.doInjectingFields(t, deps, injections, forServiceType);
        DefaultCommunicator target = (DefaultCommunicator) t;
        target.email = (io.helidon.examples.pico.logger.common.CommunicationMode) get(deps, "io.helidon.examples.pico.logger.common.email");
        target.im = (io.helidon.examples.pico.logger.common.CommunicationMode) get(deps, "io.helidon.examples.pico.logger.common.im");
        target.sms = (io.helidon.examples.pico.logger.common.CommunicationMode) get(deps, "io.helidon.examples.pico.logger.common.sms");
    }

}