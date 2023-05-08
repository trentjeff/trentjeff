// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!

package io.helidon.examples.pico.book;

import java.util.Optional;

import io.helidon.pico.api.Application;
import io.helidon.pico.api.ServiceInjectionPlanBinder;

import jakarta.annotation.Generated;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * io.helidon.examples.pico.book.Pico$$Application - Generated pico Application.
 */
@Generated(value = "io.helidon.pico.maven.plugin.ApplicationCreatorMojo", comments = "version=1")
@Singleton @Named(Pico$$Application.NAME)
public final class Pico$$Application implements Application {

    static final String NAME = "io.helidon.examples.pico.book";
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
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.BlueColor }
         */
        binder.bindTo(io.helidon.examples.pico.book.BlueColor$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.BookCase }
         */
        binder.bindTo(io.helidon.examples.pico.book.BookCase$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.allBooks", io.helidon.examples.pico.book.MobyDickInBlue$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.ParadiseLostInGreen$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.UlyssesInGreen$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.ColorWheel }
         */
        binder.bindTo(io.helidon.examples.pico.book.ColorWheel$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.setListProviderBlueThings|1(1)", io.helidon.examples.pico.book.BlueColor$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.setListProviderGreenThings|1(1)", io.helidon.examples.pico.book.GreenColor$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.setListProviderRedThings|1(1)", io.helidon.examples.pico.book.EmptyRedBookCase$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.RedColor$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredBlueThing|1(1)", io.helidon.examples.pico.book.BlueColor$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredOptionalBlueThing|1(1)", io.helidon.examples.pico.book.BlueColor$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredOptionalGreenThing|1(1)", io.helidon.examples.pico.book.GreenColor$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredOptionalRedThing|1(1)", io.helidon.examples.pico.book.EmptyRedBookCase$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredProviderGreenThing|1(1)", io.helidon.examples.pico.book.GreenColor$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.setPreferredProviderRedThing|1(1)", io.helidon.examples.pico.book.EmptyRedBookCase$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.EmptyRedBookCase }
         */
        binder.bindTo(io.helidon.examples.pico.book.EmptyRedBookCase$$Pico$$Activator.INSTANCE)
                .bindVoid("io.helidon.examples.pico.book.<init>|1(1)")
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.GreenBookCase }
         */
        binder.bindTo(io.helidon.examples.pico.book.GreenBookCase$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.<init>|1(1)", io.helidon.examples.pico.book.ParadiseLostInGreen$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.UlyssesInGreen$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.GreenColor }
         */
        binder.bindTo(io.helidon.examples.pico.book.GreenColor$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.Library }
         */
        binder.bindTo(io.helidon.examples.pico.book.Library$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.<init>|3(1)", io.helidon.examples.pico.book.MobyDickInBlue$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.ParadiseLostInGreen$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.UlyssesInGreen$$Pico$$Activator.INSTANCE)
                .bindMany("io.helidon.examples.pico.book.<init>|3(2)", io.helidon.examples.pico.book.BookCase$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.EmptyRedBookCase$$Pico$$Activator.INSTANCE, io.helidon.examples.pico.book.GreenBookCase$$Pico$$Activator.INSTANCE)
                .bind("io.helidon.examples.pico.book.<init>|3(3)", io.helidon.examples.pico.book.ColorWheel$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.MobyDickInBlue }
         */
        binder.bindTo(io.helidon.examples.pico.book.MobyDickInBlue$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.ParadiseLostInGreen }
         */
        binder.bindTo(io.helidon.examples.pico.book.ParadiseLostInGreen$$Pico$$Activator.INSTANCE)
                .commit();

        /**
        * In module name "io.helidon.examples.pico.book".
        * @see {@link io.helidon.examples.pico.book.Pico$$Module } - note that there are no known contracts or dependencies for this service type.
        */
        // binder.bindTo(io.helidon.pico.runtime.PicoModuleServiceProvider.INSTANCE)

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.RedColor }
         */
        binder.bindTo(io.helidon.examples.pico.book.RedColor$$Pico$$Activator.INSTANCE)
                .commit();

        /**
         * In module name "io.helidon.examples.pico.book".
         * @see {@link io.helidon.examples.pico.book.UlyssesInGreen }
         */
        binder.bindTo(io.helidon.examples.pico.book.UlyssesInGreen$$Pico$$Activator.INSTANCE)
                .commit();

    }

}