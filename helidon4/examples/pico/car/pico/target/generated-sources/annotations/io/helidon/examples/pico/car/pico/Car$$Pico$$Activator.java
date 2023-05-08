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
 * Activator for {@link io.helidon.examples.pico.car.pico.Car}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class Car$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<Car> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.car.pico.Car.class.getName())
            .addContractsImplemented(io.helidon.examples.pico.car.pico.Vehicle.class.getName())
            .activatorTypeName(Car$$Pico$$Activator.class.getName())
            .addScopeTypeName(jakarta.inject.Singleton.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final Car$$Pico$$Activator INSTANCE = new Car$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected Car$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.car.pico.Car.class;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.car.pico.Car.class.getName())
                .add(CONSTRUCTOR, io.helidon.examples.pico.car.pico.Engine.class, ElementKind.CONSTRUCTOR, 2, Access.PUBLIC).elemOffset(1)
                .add(CONSTRUCTOR, io.helidon.examples.pico.car.pico.Brand.class, ElementKind.CONSTRUCTOR, 2, Access.PUBLIC).elemOffset(2)
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected Car createServiceProvider(Map<String, Object> deps) { 
        io.helidon.examples.pico.car.pico.Engine c1 = (io.helidon.examples.pico.car.pico.Engine) get(deps, "io.helidon.examples.pico.car.pico.<init>|2(1)");
        io.helidon.examples.pico.car.pico.Brand c2 = (io.helidon.examples.pico.car.pico.Brand) get(deps, "io.helidon.examples.pico.car.pico.<init>|2(2)");
        return new io.helidon.examples.pico.car.pico.Car(c1, c2);
    }

}