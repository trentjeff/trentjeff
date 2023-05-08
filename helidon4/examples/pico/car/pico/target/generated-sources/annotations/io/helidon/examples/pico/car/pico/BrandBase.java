// This is a generated file (powered by Helidon). Do not edit or extend from this artifact as it is subject to change at any time!
package io.helidon.examples.pico.car.pico;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Objects;

import jakarta.annotation.Generated;

import java.util.function.Consumer;
import java.util.function.Supplier;

import io.helidon.builder.AttributeVisitor;
import io.helidon.builder.BuilderInterceptor;

/**
 * Abstract implementation w/ builder for {@link io.helidon.examples.pico.car.pico.Brand}.
 */
@Generated(value = "io.helidon.builder.processor.tools.DefaultBuilderCreatorProvider", comments = "version=1")
@SuppressWarnings("unchecked")	
public abstract class BrandBase implements io.helidon.examples.pico.car.pico.Brand {
	/**
	 * Meta properties, statically cached.
	 */
	private static final Map<String, Map<String, Object>> __META_PROPS = Collections.unmodifiableMap(__calcMeta());
	private final java.lang.String name;

	/**
	 * Constructor using the builder argument.
	 *
	 * @param b	the builder
	 */
	protected BrandBase(Builder<?, ?> b) {
		this.name = b.name;
	}

	@Override
	public java.lang.String name() {
		return name;
	}

	private static Map<String, Map<String, Object>> __calcMeta() {
		Map<String, Map<String, Object>> metaProps = new java.util.LinkedHashMap<>();
		metaProps.put("__generated", Map.of("version", "1"));
		metaProps.put("name", Map.of("__type", java.lang.String.class));
		return metaProps;
	}

	/**
	 * The map of meta attributes describing each element of this type.
	 *
	 * @return the map of meta attributes using the key being the attribute name
	 */
	public static Map<String, Map<String, Object>> __metaAttributes() {
		return __META_PROPS;
	}

	/**
	 * The map of meta attributes describing each element of this type.
	 *
	 * @return the map of meta attributes using the key being the attribute name
	 */
	public Map<String, Map<String, Object>> __metaProps() {
		return __metaAttributes();
	}

	@Override
	public String toString() {
		return io.helidon.examples.pico.car.pico.Brand.class.getSimpleName() + "(" + toStringInner() + ")";
	}

	/**
	 * Produces the inner portion of the toString() output (i.e., what is between the parens).
	 *
	 * @return portion of the toString output
	 */
	protected String toStringInner() {
		String result = "";
		result += "name=" + name();
		return result;
	}

	@Override
	public int hashCode() {
		int hashCode = 1;
		hashCode = 31 * hashCode + Objects.hash(name());
		return hashCode;
	}

	@Override
	public boolean equals(Object another) {
		if (this == another) {
			return true;
		}
		if (!(another instanceof io.helidon.examples.pico.car.pico.Brand)) {
			return false;
		}
		io.helidon.examples.pico.car.pico.Brand other = (io.helidon.examples.pico.car.pico.Brand) another;
		boolean equals = true;
		equals &= Objects.equals(name(), other.name());
		return equals;
	}

	/**
	 * Visits all attributes of io.helidon.examples.pico.car.pico.Brand, calling the {@link AttributeVisitor} for each.
	 *
	 * @param visitor			the visitor called for each attribute
	 * @param userDefinedCtx	any object you wish to pass to each visit call
	 * @param <T> type of the user defined context
	 */
	public <T> void visitAttributes(AttributeVisitor<T> visitor, T userDefinedCtx) {
		visitor.visit("name", () -> this.name(), __META_PROPS.get("name"), userDefinedCtx, java.lang.String.class);
	}


	/**
	 * Fluent API builder for {@code T}.
	 *
	 * @param <B>	the type of the builder
	 * @param <T>	the type of the built instance
	 */
	public abstract static class Builder<B extends Builder<B, T>, T extends io.helidon.examples.pico.car.pico.Brand> implements io.helidon.examples.pico.car.pico.Brand, io.helidon.common.Builder<B, T> {
		/**
		 * Field value for {@code io.helidon.examples.pico.car.pico.Brand::java.lang.String name()}.
		 */
		private java.lang.String name;

		/**
		 * Fluent API builder constructor.
		 */
		protected Builder() {
		}

		@Override
		public java.lang.String name() {
			return name;
		}

		/**
		 * Setter for 'name'.
		 *
		 * @param val the new value
		 * @return this fluent builder
		 */
		public B name(java.lang.String val) {
			this.name = Objects.requireNonNull(val);
			return identity();
		}

		/**
		 * Accept and update from the provided value object.
		 *
		 * @param val the value object to copy from
		 * @return this instance typed to correct type
		 */
		public B accept(T val) {
			Objects.requireNonNull(val);
			__acceptThis(val);
			return identity();
		}

		private void __acceptThis(T val) {
			Objects.requireNonNull(val);
			name(val.name());
		}

		/**
		 * Visits all attributes of io.helidon.examples.pico.car.pico.Brand, calling the {@link AttributeVisitor} for each.
		 *
		 * @param visitor			the visitor called for each attribute
		 * @param userDefinedCtx	any object you wish to pass to each visit call
		 * @param <T> type of the user defined context
		 */
		public <T> void visitAttributes(AttributeVisitor<T> visitor, T userDefinedCtx) {
			visitor.visit("name", () -> this.name, __META_PROPS.get("name"), userDefinedCtx, java.lang.String.class);
		}

	}

}
