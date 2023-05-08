// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!
package io.helidon.examples.pico.car.dagger2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Objects;

import jakarta.annotation.Generated;

/**
 * Concrete implementation w/ builder for {@link io.helidon.examples.pico.car.dagger2.Brand}.
 */
@Generated(value = "io.helidon.builder.processor.tools.DefaultBuilderCreatorProvider", comments = "version=1")
@SuppressWarnings("unchecked")	
public class BrandDefault extends io.helidon.examples.pico.car.dagger2.BrandBase {

	/**
	 * Constructor using the builder argument.
	 *
	 * @param b	the builder
	 */
	protected BrandDefault(Builder b) {
		super(b);
	}

	/**
	 * Creates a builder for this type.
	 *
	 * @return a builder for {@link io.helidon.examples.pico.car.dagger2.Brand}
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Creates a builder for this type, initialized with the attributes from the values passed.
	 *
	 * @param val the value to copy to initialize the builder attributes
	 * @return a builder for {@link io.helidon.examples.pico.car.dagger2.Brand}
	 */
	public static Builder toBuilder(io.helidon.examples.pico.car.dagger2.Brand val) {
		Objects.requireNonNull(val);
		return builder().accept(val);
	}


	/**
	 * Fluent API builder for {@code T}.
	 *
	 */
	public static class Builder extends io.helidon.examples.pico.car.dagger2.BrandBase.Builder<Builder, io.helidon.examples.pico.car.dagger2.Brand> {
		/**
		 * Fluent API builder constructor.
		 */
		protected Builder() {
			super();
		}

		/**
		 * Builds the instance.
		 *
		 * @return the built instance
		 * @throws IllegalArgumentException if any required attributes are missing
		 */
		public io.helidon.examples.pico.car.dagger2.BrandDefault build() {
			Builder b = this;
			RequiredAttributeVisitor visitor = new RequiredAttributeVisitor(false);
			b.visitAttributes(visitor, null);
			visitor.validate();
			return new BrandDefault(b);
		}
	}

}
