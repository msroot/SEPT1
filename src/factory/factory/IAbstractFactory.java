/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 */
package factory.factory;

import factory.product.graphics.AbstractGraphic;
import factory.product.properties.AbstractProperty;

/**
 * This is an interface for our AbstractFactory
 * 
 * @author Stefan Fuchs
 */
public abstract class IAbstractFactory {

	/**
	 * Enum for the different types we can have.
	 * 
	 * @author Stefan Fuchs
	 */
	public enum ElementType {
		RECTANGLE, CIRCLE, LINE,
		/* http://www.w3.org/TR/SVG11/intro.html#TermContainerElement */
		CONTAINER_SVG, CONTAINER_G
	};

	/* protected constructor to not be able to use new */
	protected IAbstractFactory() {
	}

	/* Singleton instance */
	protected static IAbstractFactory instance = null;

	/**
	 * Dummy method
	 * 
	 * @return null
	 */
	public static IAbstractFactory newInstance() {
		return null;
	}

	/**
	 * Create Properties for the elements
	 * 
	 * @param type
	 *            Type of element to produce
	 * @return {@link AbstractProperty}
	 */
	public abstract AbstractProperty createProperty(ElementType type);

	/**
	 * Create and element with the given property. The element is determined by
	 * the type of property passed.
	 * 
	 * @param property
	 *            The Property
	 * @return An SVG element
	 */
	public abstract AbstractGraphic createElement(AbstractProperty property);

}
