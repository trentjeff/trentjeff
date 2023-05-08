// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.book;

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
 * Activator for {@link io.helidon.examples.pico.book.ColorWheel}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class ColorWheel$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<ColorWheel> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.book.ColorWheel.class.getName())
            .activatorTypeName(ColorWheel$$Pico$$Activator.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final ColorWheel$$Pico$$Activator INSTANCE = new ColorWheel$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected ColorWheel$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.book.ColorWheel.class;
    }

    @Override
    public boolean isProvider() {
        return true;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.book.ColorWheel.class.getName())
                .add("setListProviderBlueThings", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Blue.class)).listWrapped().providerWrapped()
                .add("setListProviderGreenThings", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Green.class)).listWrapped().providerWrapped()
                .add("setListProviderRedThings", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Red.class)).listWrapped().providerWrapped()
                .add("setPreferredBlueThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Blue.class)).providerWrapped()
                .add("setPreferredOptionalBlueThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Blue.class)).optionalWrapped()
                .add("setPreferredOptionalGreenThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Green.class)).optionalWrapped()
                .add("setPreferredOptionalRedThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Red.class)).optionalWrapped()
                .add("setPreferredProviderGreenThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Green.class)).providerWrapped()
                .add("setPreferredProviderRedThing", io.helidon.examples.pico.book.Color.class, ElementKind.METHOD, 1, Access.PACKAGE_PRIVATE).elemOffset(1).addQualifier(io.helidon.pico.api.QualifierAndValueDefault.create(io.helidon.examples.pico.book.Red.class)).providerWrapped()
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected ColorWheel createServiceProvider(Map<String, Object> deps) { 
        return new io.helidon.examples.pico.book.ColorWheel();
    }

    @Override
    protected void doInjectingMethods(Object t, Map<String, Object> deps, Set<String> injections, String forServiceType) { 
        super.doInjectingMethods(t, deps, injections, forServiceType);

        ColorWheel target = (ColorWheel) t;

        target.setListProviderBlueThings((List<Provider<io.helidon.examples.pico.book.Color>>) get(deps, "io.helidon.examples.pico.book.setListProviderBlueThings|1(1)"));
        target.setListProviderGreenThings((List<Provider<io.helidon.examples.pico.book.Color>>) get(deps, "io.helidon.examples.pico.book.setListProviderGreenThings|1(1)"));
        target.setListProviderRedThings((List<Provider<io.helidon.examples.pico.book.Color>>) get(deps, "io.helidon.examples.pico.book.setListProviderRedThings|1(1)"));
        target.setPreferredBlueThing((Provider<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredBlueThing|1(1)"));
        target.setPreferredOptionalBlueThing((Optional<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredOptionalBlueThing|1(1)"));
        target.setPreferredOptionalGreenThing((Optional<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredOptionalGreenThing|1(1)"));
        target.setPreferredOptionalRedThing((Optional<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredOptionalRedThing|1(1)"));
        target.setPreferredProviderGreenThing((Provider<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredProviderGreenThing|1(1)"));
        target.setPreferredProviderRedThing((Provider<io.helidon.examples.pico.book.Color>) get(deps, "io.helidon.examples.pico.book.setPreferredProviderRedThing|1(1)"));
    }

}