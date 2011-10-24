/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.graphics;

import java.awt.Graphics;

import factory.product.properties.AbstractProperty;

/**
 * This class represents an abstract Graphic for creating the necessary elements
 * in SVG
 * 
 * @author Stefan Fuchs
 */
public abstract class AbstractGraphic {

	/* Property of the element */
	private AbstractProperty property;

	/**
	 * Default constructor responsible for setting the property.
	 * 
	 * @param property
	 *            the properties of that element
	 */
	protected AbstractGraphic(AbstractProperty property) {
		this.property = property;
	}

	/**
	 * Returns the property of the element.
	 * 
	 * @return {@link AbstractProperty}
	 */
	public AbstractProperty getProperty() {
		return property;
	}

	/*
	 * The interface necessary for dealing with SVG elements and for the
	 * Composite Pattern (Gamma et al)
	 */

	/**
	 * Method to draw Each component
	 */
	public abstract void draw(Graphics g);

	/**
	 * Default implementation does nothing. This is done so that we don't have
	 * to pollute the leaf elements.
	 * 
	 * @param graphic
	 *            {@link AbstractGraphic} to be added.
	 */
	public void add(AbstractGraphic graphic) {
	}

	/**
	 * Default implementation does nothing. This is done so that we don't have
	 * to pollute the leaf elements.
	 * 
	 * @param graphic
	 *            {@link AbstractGraphic} to be deleted.
	 */
	public void remove(AbstractGraphic graphic) {
	}

	/**
	 * Default implementation returns zero. This is done so that we don't have
	 * to pollute the leaf elements.
	 * 
	 * @return The child count.
	 */
	public int getChildCount() {
		return 0;
	}

	/**
	 * Default implementation returns null. This is done so that we don't have
	 * to pollute the leaf elements.
	 * 
	 * @param n
	 *            the index of the child
	 * @return The child at the given index
	 */
	public AbstractGraphic getChild(int n) {
		return null;
	}

}
