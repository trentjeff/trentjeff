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
 * Activator for {@link io.helidon.examples.pico.book.Library}.
 */
// @Singleton 
@SuppressWarnings("unchecked")
@Generated(value = "io.helidon.pico.tools.ActivatorCreatorDefault", comments = "version=1")
public class Library$$Pico$$Activator
            extends io.helidon.pico.runtime.AbstractServiceProvider<Library> {
    private static final ServiceInfoDefault serviceInfo =
        ServiceInfoDefault.builder()
            .serviceTypeName(io.helidon.examples.pico.book.Library.class.getName())
            .addContractsImplemented(io.helidon.examples.pico.book.BookHolder.class.getName())
            .activatorTypeName(Library$$Pico$$Activator.class.getName())
            .addScopeTypeName(jakarta.inject.Singleton.class.getName())
            .build();

    /**
     * The global singleton instance for this service provider activator.
     */
    public static final Library$$Pico$$Activator INSTANCE = new Library$$Pico$$Activator();

    /**
     * Default activator constructor.
     */
    protected Library$$Pico$$Activator() {
        serviceInfo(serviceInfo);
    }

    /**
     * The service type of the managed service.
     *
     * @return the service type of the managed service
     */
    public Class<?> serviceType() {
        return io.helidon.examples.pico.book.Library.class;
    }

    @Override
    public DependenciesInfo dependencies() {
        DependenciesInfo deps = Dependencies.builder(io.helidon.examples.pico.book.Library.class.getName())
                .add(CONSTRUCTOR, io.helidon.examples.pico.book.Book.class, ElementKind.CONSTRUCTOR, 3, Access.PUBLIC).elemOffset(1).listWrapped().providerWrapped()
                .add(CONSTRUCTOR, io.helidon.examples.pico.book.BookHolder.class, ElementKind.CONSTRUCTOR, 3, Access.PUBLIC).elemOffset(2).listWrapped()
                .add(CONSTRUCTOR, io.helidon.examples.pico.book.ColorWheel.class, ElementKind.CONSTRUCTOR, 3, Access.PUBLIC).elemOffset(3)
                .build();
        return Dependencies.combine(super.dependencies(), deps);
    }

    @Override
    protected Library createServiceProvider(Map<String, Object> deps) { 
        List<Provider<io.helidon.examples.pico.book.Book>> c1 = (List<Provider<io.helidon.examples.pico.book.Book>>) get(deps, "io.helidon.examples.pico.book.<init>|3(1)");
        List<io.helidon.examples.pico.book.BookHolder> c2 = (List<io.helidon.examples.pico.book.BookHolder>) get(deps, "io.helidon.examples.pico.book.<init>|3(2)");
        io.helidon.examples.pico.book.ColorWheel c3 = (io.helidon.examples.pico.book.ColorWheel) get(deps, "io.helidon.examples.pico.book.<init>|3(3)");
        return new io.helidon.examples.pico.book.Library(c1, c2, c3);
    }

    @Override
    public Optional<PostConstructMethod> postConstructMethod() {
        Library target = (Library) serviceRef().orElseThrow();
        return Optional.of(target::postConstruct);
    }

    @Override
    public Optional<PreDestroyMethod> preDestroyMethod() {
        Library target = (Library) serviceRef().orElseThrow();
        return Optional.of(target::preDestroy);
    }

}