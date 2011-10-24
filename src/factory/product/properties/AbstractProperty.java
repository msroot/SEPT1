/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.properties;

import factory.factory.IAbstractFactory;

/**
 * Abstract Property for all elements present in SVG
 * 
 * @author Stefan Fuchs
 */
public abstract class AbstractProperty {
	
	/* The actual type of property */
	private IAbstractFactory.ElementType type; 
	
	/**
	 * Constructor for properties. 
	 * 
	 * @param type The type of property
	 */
	protected AbstractProperty( IAbstractFactory.ElementType type ) {
		this.type = type;
	}

	/**
	 * Accessor for the property type
	 * 
	 * @return Property type
	 */
	public IAbstractFactory.ElementType getType() {
		return type;
	}

}
