// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.car.pico;

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
 * Activator for {@link io.helidon.examples.pico.car.pico.BrandProvider}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class BrandProvider$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<BrandProvider> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.car.pico.BrandProvider.class.getName())
            .addContractsImplemented(io.helidon.examples.pico.car.pico.Brand.class.getName())
            .addExternalContractsImplemented(jakarta.inject.Provider.class.getName())
            .activatorTypeName(BrandProvider$$Pico$$Activator.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final BrandProvider$$Pico$$Activator INSTANCE = new BrandProvider$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected BrandProvider$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.car.pico.BrandProvider.class;
    }

    @Override
    public boolean isProvider() {
        return true;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.car.pico.BrandProvider.class.getName())
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected BrandProvider createServiceProvider(Map<String, Object> deps) { 
        return new io.helidon.examples.pico.car.pico.BrandProvider();
    }

}