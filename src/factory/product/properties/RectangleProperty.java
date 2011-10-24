/*
 * SEPT Assignment 1
 * 
 * Author: Stefan fuchs
 * 
 */
package factory.product.properties;

import datatypes.basic.Color;
import datatypes.basic.Coordinate;
import datatypes.basic.Length;
import factory.factory.IAbstractFactory;

/**
 * This class represents the properties ie. attributes that
 * a <rect> element can have.
 * 
 * @author Stefan Fuchs
 *
 */
public class RectangleProperty extends AbstractProperty {
	
	/* Attributes to be implemented */
	private Coordinate x = null;
	private Coordinate y = null;
	
	private Length width = null;
	private Length height = null;
	
	private Color fill = null;
	private Color stroke = null;
	private Length strokeWidth = null;

	/**
	 * Constructor
	 */
	public RectangleProperty() {
		super(IAbstractFactory.ElementType.RECTANGLE);
	}
	
	/**
	 * Set x
	 * 
	 * @param pos Position
	 * @param unit Unit of Position
	 */
	public void setX(float pos, String unit) {
		this.x = new Coordinate(pos, unit);
	}
	
	/**
	 * Get X in pixels
	 * 
	 * @return x
	 */
	public float getX() {
		return x.getLength();
	}
	
	/**
	 * Set y
	 * 
	 * @param length Position
	 * @param unit Unit of Position
	 */
	public void setY(float pos, String unit) {
		this.y = new Coordinate(pos, unit);
	}
	
	/**
	 * Get Y in pixels
	 * 
	 * @return y
	 */
	public float getY() {
		return y.getLength();
	}
	
	/**
	 * Set width
	 * 
	 * @param length Length
	 * @param unit Unit of Length
	 */
	public void setWidth(float length, String unit) {
		this.width = new Length(length, unit);
	}
	
	/**
	 * Get Width in pixels
	 * 
	 * @return width
	 */
	public float getWidth() {
		return width.getLength();
	}
	
	/**
	 * Set height
	 * 
	 * @param length Length
	 * @param unit Unit of Length
	 */
	public void setHeight(float length, String unit) {
		this.height = new Length(length, unit);
	}
	
	/**
	 * Get Height in pixels
	 * 
	 * @return height
	 */
	public float getHeight() {
		return height.getLength();
	}
	
	/**
	 * Set width of the stroke
	 * 
	 * @param width Width
	 * @param unit The unit of width
	 */
	public void setStrokeWidth(float width, String unit) {
		this.strokeWidth = new Length(width, unit);
	}
	
	/**
	 * Get width of the stroke
	 * 
	 * @return Width of stroke in pixels
	 */
	public float getStrokeWidth() {
		return strokeWidth.getLength();
	}
	
	/**
	 * Set the color with rgb values
	 * 
	 * @param r Red
	 * @param g Green
	 * @param b Blue
	 */
	public void setFill(int r, int g, int b) {
		this.fill = new Color(r, g, b);
	}
	
	/**
	 * Set color with name.
	 * @param name Name of a color according to the Specification.
	 * 		If <code>null</code> or another color that is not specified,
	 * 		then the color defaults to black.
	 */
	public void setFill( String name ) {
		if ( name == null ) {
			this.fill = null;
		} else {
			this.fill = new Color(name);
		}
	}
	
	/**
	 * Get the fill attribute
	 * 
	 * @return The color
	 */
	public Color getFill() {
		return fill;
	}
	
	/**
	 * Set the color with rgb values
	 * 
	 * @param r Red
	 * @param g Green
	 * @param b Blue
	 */
	public void setStroke(int r, int g, int b) {
		this.stroke = new Color(r, g, b);
	}
	
	/**
	 * Set color with name.
	 * @param name Name of a color according to the Specification.
	 * 		If <code>null</code> or another color that is not specified,
	 * 		then the color defaults to black.
	 */
	public void setStroke( String name ) {
		if ( name == null ) {
			this.stroke = null;
		} else {
			this.stroke = new Color(name);
		}
	}
	
	/**
	 * Get the fill attribute
	 * 
	 * @return The color
	 */
	public Color getStroke() {
		return stroke;
	}
	
}
