/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.properties;

import datatypes.basic.Length;
import factory.factory.IAbstractFactory;

/**
 * This class represents the properties ie. attributes that
 * an <svg> element can have.
 * 
 * @author Stefan Fuchs
 *
 */
public class SVGProperty extends AbstractProperty{

	private Length width;
	
	private Length height;
	
	/**
	 * Constructor. Set the type of Property automatically.
	 * 
	 */
	public SVGProperty() {
		super(IAbstractFactory.ElementType.CONTAINER_SVG);
	}

	/**
	 * Set the width of the element
	 * 
	 * @param length Length
	 * @param unit Unit of length
	 */
	public void setWidth( float length, String unit ) {
		this.width = new Length(length, unit);
	}
	
	/**
	 * Get the width of the element in pixles
	 * 
	 * @return Length in pixles
	 */
	public float getWidth() {
		return width.getLength();
	}
	
	/**
	 * Set the height of the element
	 * @param length Length
	 * @param unit Unit of length
	 */
	public void setHeight(  float length, String unit ) {
		this.height = new Length(length, unit);
	}
	
	/**
	 * Get the height of the element in pixles
	 * 
	 * @return Length in pixles
	 */
	public float getHeight() {
		return height.getLength();
	}
	
}